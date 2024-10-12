# uui - Universal UI Components for Jetpack Compose

**uui** is a reusable **UI component library** for **Android** applications using **Jetpack Compose**. It provides a set of well-structured and modular components to build clean, maintainable, and scalable user interfaces.

## Features
- Modular **base components** (buttons, text, switches, etc.)
- **Composite components** (forms, dialogs, profile cards, etc.)
- **Feedback components** (snackbars, loaders, progress bars)
- **Theming system** with light and dark modes
- Layout components for lists and grids
- Easy integration with **Material3 Design System**

---

## Installation

To include `uui` in your project, you can add the module directly or, in the future, integrate it via a package manager like **Jitpack** (once hosted).

### Manual Integration

1. Download or clone the `uui` library into your Android Studio project.
2. Add the following dependency to your **app-level** `build.gradle`:

```gradle
dependencies {
    implementation project(':uui')
}
```

3. Sync your project to ensure that all components are available.

---

## Usage

Here’s a quick overview of how to use some of the core components in **uui**:

### 1. **Primary Button**
A bold button for primary actions.

```kotlin
import com.example.ui.base.PrimaryButton

@Composable
fun MyScreen() {
    PrimaryButton(text = "Submit", onClick = { /* Handle submit */ })
}
```

### 2. **Outlined Button**
A secondary button with an outline.

```kotlin
import com.example.ui.base.OutlinedButton

@Composable
fun MyScreen() {
    OutlinedButton(text = "Cancel", onClick = { /* Handle cancel */ })
}
```

### 3. **Input Form**
A reusable form with validation logic.

```kotlin
import com.example.ui.composite.InputForm

@Composable
fun MyFormScreen() {
    InputForm(onSubmit = { input -> 
        // Handle form submission
    })
}
```

### 4. **Custom Dialog**
A dialog box with customizable title, content, and actions.

```kotlin
import com.example.ui.composite.CustomDialog

@Composable
fun MyDialog() {
    CustomDialog(
        title = "Delete Item",
        content = "Are you sure you want to delete this item?",
        onDismiss = { /* Handle dismiss */ },
        onConfirm = { /* Handle confirm */ }
    )
}
```

### 5. **Theming**
Customize the look and feel with dark mode support and a cohesive typography system.

```kotlin
import com.example.ui.theme.AndroidTheme

@Composable
fun MyApp() {
    AndroidTheme {
        // Your app's UI
    }
}
```

---

## Available Components

### 1. **Base Components**
- `PrimaryButton`: A button for primary actions.
- `OutlinedButton`: A button with an outlined border.
- `BaseText`: A simple text component.
- `ToggleSwitch`: A switch for toggling between states.

### 2. **Composite Components**
- `ProfileCard`: A card for displaying user information.
- `InputForm`: A form with text input and validation.
- `CustomDialog`: A dialog with a title, content, and actions.

### 3. **Feedback Components**
- `CustomSnackbar`: A snackbar for brief messages.
- `CircularLoader`: A circular loading indicator.
- `LinearProgressBar`: A progress bar for ongoing tasks.

### 4. **Layout Components**
- `LazyColumnList`: A vertically scrollable list.
- `LazyRowList`: A horizontally scrollable list.

### 5. **Navigation Components**
- `AppBar`: A top app bar with a title and actions.
- `BottomNavigation`: A bottom navigation bar for switching between sections.

---

## Theming System

The **uui** library comes with a flexible theming system that supports both **light** and **dark** modes. You can easily customize the colors, typography, and shapes of your UI by modifying the theme.

### Colors
- **Primary**, **Secondary**, and **Tertiary** colors for branding.
- **Background** and **Surface** colors for containers.
- **Error** colors for validation or error states.

### Typography
- Custom typography for headlines, body text, and captions.
- Supports different font weights, sizes, and colors.

### Shapes
- Define shape styles for buttons, cards, and other components.
- Rounded corners for modern UI aesthetics.

---

## Contributing

We welcome contributions to **uui**! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Make your changes and commit (`git commit -am 'Add new feature'`).
4. Push your branch (`git push origin feature/your-feature`).
5. Open a pull request.

Please ensure your code adheres to the project's coding standards and that you provide sufficient test coverage for new features.

---

## License

**uui** is licensed under the **MIT License**. Feel free to use and modify it in your own projects.

---

## Acknowledgements

**uui** is inspired by modern UI design systems and aims to simplify UI development in Jetpack Compose while promoting reusability and modularity.

---

## Contact

For any questions, suggestions, or issues, feel free to open an issue or reach out via email at `support@example.com`.
