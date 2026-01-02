## Overview

This is a compact library catalogue application developed as an Android mobile application. The Library app presents a scrollable list of book entries sourced from a local JSON asset, showing cover art, titles, authors, ISBNs, and synopses. It demonstrates core Android patterns such as RecyclerView adapters, view holders, and Material card-based layouts for clean, readable content presentation.

![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)
![Java 8](https://img.shields.io/badge/Java-8-007396?style=flat-square&logo=java&logoColor=white)
![Android SDK 33](https://img.shields.io/badge/Android%20SDK-33-3DDC84?style=flat-square&logo=android&logoColor=white)
![Gradle 8.0](https://img.shields.io/badge/Gradle-8.0-02303A?style=flat-square&logo=gradle&logoColor=white)
![Android Gradle Plugin 8.0.1](https://img.shields.io/badge/Android%20Gradle%20Plugin-8.0.1-02303A?style=flat-square&logo=gradle&logoColor=white)
![Material Components 1.5.0](https://img.shields.io/badge/Material%20Components-1.5.0-757575?style=flat-square&logo=material-design&logoColor=white)

## Features

The Library Android application offers the following features:

1. **RecyclerView Book List**

   - Efficient scrollable list for book entries
   - LinearLayoutManager for smooth vertical scrolling
   - View holder pattern for performance and reuse

2. **Book Cards**

   - MaterialCardView layout for each book
   - Cover image, title, author, ISBN, and synopsis
   - ConstraintLayout for tidy, responsive alignment

3. **Local JSON Data Source**

   - Book data stored in `assets/books.json`
   - Simple parsing with `org.json` to populate the list
   - No network dependency for content

4. **Cover Image Rendering**

   - Drawable-based cover images loaded by resource name
   - Centre-inside scaling to preserve cover proportions
   - Clean, minimal card background styling

5. **Modern Android UI**

   - Material Design components
   - Consistent typography and spacing
   - Light theme styling with clear contrast

6. **Data Model Separation**

   - `Book` model for structured data
   - `BookAdapter` for binding data to UI
   - `MainActivity` for list initialisation and setup

## Technologies Used

- **Java 8**: Primary programming language
  - Source and target compatibility with Java 8 features
- **Android SDK 33**: Android 13 compile and target SDK
  - Minimum SDK: API 30 (Android 11)
  - Target SDK: API 33 (Android 13)
- **Android Gradle Plugin 8.0.1**: Android build tooling
- **Gradle 8.0**: Build automation and dependency management
- **AndroidX Libraries**:
  - AppCompat 1.6.1: Backward compatibility support
  - Material Components 1.5.0: Material Design UI components
  - ConstraintLayout 2.1.4: Advanced layout management
- **Testing Frameworks**:
  - JUnit 4.13.2: Unit testing framework
  - AndroidX Test Ext JUnit 1.1.5: Android instrumentation testing
  - Espresso Core 3.5.1: UI testing automation

## Project Specifications

- **Platform**: Android Mobile Application
- **Programming Language**: Java
- **Minimum Android Version**: Android 11 (API 30)
- **Target Android Version**: Android 13 (API 33)
- **Application ID**: com.example.library
- **Version**: 1.0 (Version Code: 1)
- **Build System**: Gradle with Android plugins
- **Architecture Pattern**: RecyclerView adapter pattern with model separation

## User Interfaces

### UIs

![Library UI](https://github.com/supunxiii/supunxiii/blob/7653f59dcf38771e7791a1cc0795c9d6b4cdcd3c/user-interfaces/library-app/library-adapter-recycler-view-ui-1.png)

## Getting Started

To run the Library Android application locally, follow these steps:

1. **Prerequisites**:

   - Install [Android Studio](https://developer.android.com/studio) (Electric Eel or later recommended)
   - Ensure Java Development Kit (JDK) 8 or higher is installed
   - Set up an Android Virtual Device (AVD) or connect a physical Android device

2. Clone the repository:

   ```shell
   git clone https://github.com/supunxiii/library-app.git
   ```

3. Navigate to the project directory:

   ```shell
   cd library-app
   ```

4. Open the project in Android Studio:

   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned repository directory
   - Click "OK" to open the project

5. Sync the project with Gradle:

   - Android Studio should automatically prompt to sync
   - If not, click "File" -> "Sync Project with Gradle Files"
   - Wait for the sync to complete

6. Run the application:

   - Select your target device (emulator or physical device)
   - Click the "Run" button (green play icon) or press `Shift + F10`
   - The application will build and install on your selected device

7. Alternative: Build from command line:

   ```shell
   # On macOS/Linux
   ./gradlew assembleDebug

   # On Windows
   gradlew.bat assembleDebug
   ```

   The APK will be generated in `app/build/outputs/apk/debug/`

## Project Structure

```
library-app/
├── .gradle/                                     # Gradle cache and build files
├── .idea/                                       # Android Studio IDE configurations
├── app/                                         # Main application module
│   ├── src/
│   │   ├── main/
│   │   │   ├── assets/
│   │   │   │   └── books.json                   # Book data source
│   │   │   ├── java/com/example/library/
│   │   │   │   ├── MainActivity.java            # Main activity class
│   │   │   │   ├── BookAdapter.java             # RecyclerView adapter
│   │   │   │   └── Book.java                    # Data model class
│   │   │   ├── res/
│   │   │   │   ├── drawable/                    # Book covers and drawable assets
│   │   │   │   └── layout/
│   │   │   │       ├── activity_main.xml        # Main layout with RecyclerView
│   │   │   │       └── book_layout.xml          # Book card layout
│   │   │   └── AndroidManifest.xml              # App manifest
│   │   ├── androidTest/                         # Instrumented tests
│   │   └── test/                                # Unit tests
│   ├── build.gradle                             # App-level build config
│   └── proguard-rules.pro                       # ProGuard rules
├── gradle/                                      # Gradle wrapper files
│   └── wrapper/
├── build.gradle                                 # Project-level build config
├── gradle.properties                            # Gradle properties
├── gradlew                                      # Gradle wrapper script (Unix)
├── gradlew.bat                                  # Gradle wrapper script (Windows)
├── settings.gradle                              # Project settings
└── README.md                                    # This file
```

## Development Guidelines

### Building the Application

To build the project in different configurations:

```shell
# Debug build
./gradlew assembleDebug

# Release build (requires signing configuration)
./gradlew assembleRelease

# Clean and rebuild
./gradlew clean assembleDebug
```

### Running Tests

```shell
# Run unit tests
./gradlew test

# Run instrumented tests (requires connected device/emulator)
./gradlew connectedAndroidTest

# Run all tests
./gradlew testDebug connectedAndroidTest
```

## Contributors

This project was developed by:

- **Supun Wijesooriya** - Developer

## Contributing

Contributions to the Library application are welcome! If you would like to contribute, please follow these steps:

1. Fork the repository.

2. Create a new branch:

   ```shell
   git checkout -b feature/your-feature-name
   ```

3. Make your changes and commit them:

   ```shell
   git commit -m "Add your commit message"
   ```

4. Push your changes to your forked repository:

   ```shell
   git push origin feature/your-feature-name
   ```

5. Open a pull request to the main repository, describing your changes and the purpose of the pull request.

## Important Notes

- This application requires **Android 11 (API 30) or higher** to run
- The application is optimised for mobile devices running Android 11-13
- Uses RecyclerView for efficient memory management and smooth scrolling
- Material Design components ensure consistent UI across different Android devices
- ProGuard rules are included for code optimisation in release builds
- Book data is stored in local JSON assets for easy maintenance

## Future Enhancements

Potential improvements for future versions:

- Book detail pages with extended information
- Search functionality to find specific titles or authors
- Favourites list for bookmarked books
- Category filters for genres or authors
- Offline data updates with local storage
- Share book details via social media
- UI animations for card interactions
- Dark theme styling with custom colour schemes

## Contact

For any enquiries or feedback, please contact the development team:

- **Supun Wijesooriya**: [GitHub Profile](https://github.com/supunxiii)
- **Project Repository**: [library-app](https://github.com/supunxiii/library-app)

---

**Note:** This is a beginner-friendly programme designed to understand Android native application development. The project covers fundamental concepts including RecyclerView implementation, Activity lifecycle management, adapter patterns, ConstraintLayout usage, XML-based UI design, resource management (drawables and assets), Material Design principles, and AndroidX library integration. This application serves as a learning resource for building scrollable lists with custom layouts in Android.
