# Solar Icons for Compose Multiplatform

[![Maven Central](https://img.shields.io/maven-central/v/io.github.wolfeleo2.solaricons/solar-icons-all.svg)](https://central.sonatype.com/namespace/io.github.wolfeleo2.solaricons)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A 100% complete, modular, high-performance **Compose Multiplatform** port of the stunning [Solar Icon Set](https://solar-icons.dev/) by 480 Design.

Supports **7,300+ icons** across all 6 official styles with first-class Compose Multiplatform support:
- **Android**
- **iOS** (`iosArm64`, `iosSimulatorArm64`)
- **Desktop** (`jvm`)
- **Web** (`wasmJs`, `js`)

---

## ✨ Features

- 🎨 **All 6 Styles Supported:**
  - `Bold` (1,246 icons)
  - `BoldDuotone` (1,215 icons)
  - `Linear` (1,246 icons)
  - `LineDuotone` (1,215 icons)
  - `Broken` (1,193 icons)
  - `Outline` (1,215 icons)
- 🧩 **Modular Artifacts:** Install only the styles you need (`solar-icons-bold`, `solar-icons-bold-duotone`, etc.) to keep your compile times lightning fast, DEX size tiny, and IDE autocomplete responsive. Or install `solar-icons-all` for the full collection.
- 🌓 **True Duotone Color Theming (100% Parity):**
  - Uses multi-layer path vectorization matching Solar's official Figma and web design.
  - Defaults to Solar's brand `#1C274C` (with secondary paths rendered at 50% alpha).
  - Integrates seamlessly with Compose Material 3 ambient `LocalContentColor.current`.
  - Supports custom dual-color theming via the `@Composable SolarIcon` helper (e.g., custom primary color, secondary color, and opacity).
- ⚡ **Zero-Overhead Memory Footprint:** Icons are lazily backed properties generated from pure Kotlin `ImageVector` builder DSLs with zero runtime SVG parsing overhead.

---

## 📦 Installation

### Using Version Catalog (`gradle/libs.versions.toml`) — Recommended

In your `gradle/libs.versions.toml`:

```toml
[versions]
solarIcons = "1.0.0"

[libraries]
# Core definitions & @Composable SolarIcon helper
solar-icons-core = { module = "io.github.wolfeleo2.solaricons:solar-icons-core", version.ref = "solarIcons" }

# Modular styles (add only what you need):
solar-icons-bold = { module = "io.github.wolfeleo2.solaricons:solar-icons-bold", version.ref = "solarIcons" }
solar-icons-bold-duotone = { module = "io.github.wolfeleo2.solaricons:solar-icons-bold-duotone", version.ref = "solarIcons" }
solar-icons-linear = { module = "io.github.wolfeleo2.solaricons:solar-icons-linear", version.ref = "solarIcons" }
solar-icons-line-duotone = { module = "io.github.wolfeleo2.solaricons:solar-icons-line-duotone", version.ref = "solarIcons" }
solar-icons-broken = { module = "io.github.wolfeleo2.solaricons:solar-icons-broken", version.ref = "solarIcons" }
solar-icons-outline = { module = "io.github.wolfeleo2.solaricons:solar-icons-outline", version.ref = "solarIcons" }

# Or the all-in-one umbrella:
solar-icons-all = { module = "io.github.wolfeleo2.solaricons:solar-icons-all", version.ref = "solarIcons" }

# Or the BOM:
solar-icons-bom = { module = "io.github.wolfeleo2.solaricons:solar-icons-bom", version.ref = "solarIcons" }
```

Then in your `build.gradle.kts`:

#### For Multiplatform (CMP / KMP)
```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.solar.icons.core)
            implementation(libs.solar.icons.bold.duotone)
            implementation(libs.solar.icons.linear)
        }
    }
}
```

#### For Standard Android / Jetpack Compose (Non-KMP)
Yes! Standard Android apps can consume it directly in `app/build.gradle.kts`:
```kotlin
dependencies {
    implementation(libs.solar.icons.core)
    implementation(libs.solar.icons.bold.duotone)
    implementation(libs.solar.icons.linear)
}
```

---

### Direct String Coordinates (Alternative)

```kotlin
// Multiplatform (commonMain) or Android (dependencies):
implementation("io.github.wolfeleo2.solaricons:solar-icons-core:1.0.0")
implementation("io.github.wolfeleo2.solaricons:solar-icons-bold-duotone:1.0.0")
implementation("io.github.wolfeleo2.solaricons:solar-icons-linear:1.0.0")
```

---

## 🚀 Usage

### Standard Compose `Icon`

All icons expose standard Compose `ImageVector` instances and work directly with `androidx.compose.material3.Icon`:

```kotlin
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import io.github.wolfeleo2.solaricons.SolarIcons
import io.github.wolfeleo2.solaricons.boldduotone.Home
import io.github.wolfeleo2.solaricons.linear.Bell

@Composable
fun MyScreen() {
    // Duotone icon tinted with your primary color (secondary layer automatically at 50% opacity)
    Icon(
        imageVector = SolarIcons.BoldDuotone.Home,
        contentDescription = "Home",
        tint = MaterialTheme.colorScheme.primary
    )

    // Linear outline icon
    Icon(
        imageVector = SolarIcons.Linear.Bell,
        contentDescription = "Notifications"
    )
}
```

### Advanced Dual-Color Theming with `SolarIcon`

For fine-grained dual-color duotone styling (like the Solar Icons web showcase):

```kotlin
import androidx.compose.ui.graphics.Color
import io.github.wolfeleo2.solaricons.SolarIcon
import io.github.wolfeleo2.solaricons.SolarIcons
import io.github.wolfeleo2.solaricons.boldduotone.User

@Composable
fun ProfileHeader() {
    SolarIcon(
        solarIcon = SolarIcons.BoldDuotone.User,
        contentDescription = "Profile",
        primaryColor = Color(0xFF2E63E6),    // Main glyph details
        secondaryColor = Color(0xFF90B5FF),  // Background/fill layer
        secondaryOpacity = 0.4f
    )
}
```

If `primaryColor` is omitted, it defaults to the ambient `LocalContentColor.current` (or the icon's original Solar color `#1C274C` if no ambient content color is present).

---

## 🛠️ Style Guide & Naming

Icons are organized under the `SolarIcons` group object by style:

- `SolarIcons.Bold.<IconName>`
- `SolarIcons.BoldDuotone.<IconName>`
- `SolarIcons.Linear.<IconName>`
- `SolarIcons.LineDuotone.<IconName>`
- `SolarIcons.Broken.<IconName>`
- `SolarIcons.Outline.<IconName>`

Icons with numbers at the start are prefixed with `_` (e.g. `SolarIcons.Linear._4k`), and special characters/spaces are sanitized to PascalCase (e.g. `SolarIcons.Linear.FolderFavouriteBookmark`). Where category collisions occur in the official set (such as `Building/Home.svg` vs `UI/Home.svg`), the category is appended (`Home` vs `HomeBuilding`).

---

## 📄 License

- Code & Compose Multiplatform implementation: MIT License.
- Original SVG icons: Designed by [480 Design](https://solar-icons.com/) under CC BY 4.0 / MIT.
