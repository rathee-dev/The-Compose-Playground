# 🚀 The Compose Playground

<div align="center">

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Build](https://img.shields.io/badge/Build-Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

**A comprehensive showcase of modern Android development using Declarative UI.**

</div>

---

## 🌟 Overview
Welcome to **The Compose Playground**! This repository is a deep dive into **Jetpack Compose**, exploring everything from basic layouts to complex UI compositions. Each project here is a building block in mastering the art of building intuitive, performant, and beautiful Android applications.

---

## 📱 Project Deep Dives

### 📰 1. Compose Article
A foundational project focusing on content hierarchy and text styling.
- **Key Concepts:** `Column` layout, `Image` scaling, `TextAlign.Justify`.
- **Technical Detail:** Implements a vertical stack using `Column` to seamlessly blend a hero image with a title and multi-paragraph text. It uses `stringResource` for localization and `painterResource` for efficient asset loading.
- **Visuals:**
  <br/>
  <img src="./media/ComposeArticle_screenshot.png" width="280" alt="Compose Article" />

---

### 🎨 2. Compose Quadrant
An exploration of screen segmentation and weight-based layouts.
- **Key Concepts:** `Modifier.weight()`, `Row` and `Column` nesting, Background color management.
- **Technical Detail:** This project demonstrates how to divide the viewport into equal sections using the `weight` modifier. Each quadrant is a reusable composable that encapsulates its own styling and alignment logic.
- **Visuals:**
  <br/>
  <img src="./media/ComposeQuadrant_screenshot.png" width="280" alt="Compose Quadrant" />

---

### 🎂 3. Happy Birthday Card
A creative take on layering and visual aesthetics.
- **Key Concepts:** `Box` layout (Z-axis stacking), `ContentScale.Crop`, Alpha transparency.
- **Technical Detail:** Utilizes the `Box` composable to layer text over a full-screen background image. It showcases how to use `ContentScale` to maintain aspect ratios and `alpha` modifiers to ensure text readability against busy backgrounds.
- **Visuals:**
  <br/>
  <img src="./media/HappyBirthdayCard_screenshot.png.png" width="280" alt="Happy Birthday" />

---

### 💳 4. Profile Card
A professional UI component showcasing contact information and branding.
- **Key Concepts:** Material Icons, `Surface` containers, `Arrangement.Center`.
- **Technical Detail:** Features a sophisticated layout with a top branding section and a bottom contact list. It makes extensive use of `Vector Graphics (ImageVector)` and custom `Row` components to create a clean, modern digital business card.
- **Visuals:**
  <br/>
  <img src="./media/ProfileCard_screenshot.png" width="280" alt="Profile Card" />

---

### ✅ 5. Task Manager UI
A minimal and feedback-oriented user interface.
- **Key Concepts:** `Arrangement.Center`, `FontWeight.Bold`, Material3 `Surface`.
- **Technical Detail:** Focuses on perfect centering of elements using `verticalArrangement` and `horizontalAlignment`. It demonstrates the use of typography weights to create visual hierarchy in simple informative screens.
- **Visuals:**
  <br/>
  <img src="./media/TaskManagerUI_screenshot.png" width="280" alt="Task Manager" />

---

## 🛠️ Technical Stack & Tooling

- **Language:** Kotlin 1.9+ 🛡️
- **UI Framework:** Jetpack Compose (Material 3) 🎨
- **Architecture:** Declarative UI Patterns 🏗️
- **Build System:** Gradle (Kotlin DSL) 🐘
- **Targeting:** Android SDK 34+ 📱

## 🚀 Getting Started

1.  **Clone the Repo:**
    ```bash
    git clone https://github.com/rathee-dev/The-Compose-Playground.git
    ```
2.  **Open in Android Studio:**
    Select any sub-folder (e.g., `ProfileCard`) to open it as a standalone project.
3.  **Run & Explore:**
    Hit `Shift + F10` to see the magic happen on your device!

---

<div align="center">

**Created with ❤️ by Himanshu**
*Exploring the future of Android, one Composable at a time.*

</div>
