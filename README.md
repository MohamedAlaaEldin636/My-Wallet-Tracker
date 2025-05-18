# This Project is Still Under Development inshallah

# My Wallet Tracker

- This is an Android Project (Open Source) About Personal Finance Tracking inshallah.

- TODO (del this note later), Check your Lark for more details inshallah,
Also add remaining data here, ex. preview, tech. used etc... .

## Project Structure

- Multi-Module Android Project (by Feature & Layer) inshallah,
inspired by [This Talk (Check Figure at 4:19)](https://www.youtube.com/watch?v=16SwTvzDO0A).

- Note it's better to start your App as a Monolithic App and then when you either notice gradle 
build take longer time OR in a team and you want to make better separation OR in case of a large
project, you can start considering Multi-Module as it comes with it's setup complexity,
However here we started it at the beginning as this is used to practice and to showcase code 
usage with that architecture structure inshallah.

### Modules

- Core
  - :core -> Contains Kotlin/Java Generic helper extensions & shared code needed.
  - :core:ui -> Contains General (Android Aware) shared code.
- Data
  - :data -> Database, tables and maybe DAOs
  - :data:feature_a -> local/remote data source + repo
- Domain
  - :domain -> Shared domain model classes
  - :domain:feature_a -> UseCase that uses repo and can add any additional business logic inside of 
  it and/or validations inshallah.
- UI
  - :ui -> Contains shared ui components in all ui modules example MWTButton, MWTText etc...
  - :ui:feature_a -> has business related components and screens/dialogs of this feature isa.
- App
  - :app -> Contains the Entry points of the App + combines feature screens according to the 
  Application flow isa.

## [License](LICENSE)

```
Copyright © 2025 Mohamed Alaa

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and limitations under the License.
```

| Permissions         | Limitations           | Conditions   |
| ------------------- | --------------------- | ----------- |
| :heavy_check_mark: Commercial Use | :x: Trademark use | :information_source: License and copyright notice |
| :heavy_check_mark: Modification | :x: Liability | :information_source: State changes |
| :heavy_check_mark: Distribution | :x: Warranty | - |
| :heavy_check_mark: Patent use | - | - |
| :heavy_check_mark: Private use | - | - |
