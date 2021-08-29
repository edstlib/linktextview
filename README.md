# LinkTextView

![LinkTextView](https://i.ibb.co/HtKNSnB/linktextview.png)
## Setup
### Gradle

Add this to your project level `build.gradle`:
```groovy
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
Add this to your app `build.gradle`:
```groovy
dependencies {
    implementation 'com.github.edtslib:linktextview:latest'
}
```
# Usage

The SwipeBottomView is very easy to use. Just add it to your layout like any other view.
##### Via XML

Here's a basic implementation.

```xml
        <id.co.edtslib.linktextview.LinkTextView
            app:linkColor="#ff0000"
            app:linkText="Syarat &amp; Ketentuan"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Dengan melanjutkan, kamu menyetujui Syarat &amp; Ketentuan layanan di Aplikasi."
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toTopOf="parent" />
```
### Attributes information

An example is shown below.

```xml
        app:linkColor="#ff0000"
        app:linkText="Syarat &amp; Ketentuan"
```

##### _app:linkColor_
[string]: color of link

##### _app:linkText_
[reference]: the text to be in link

### Listener for click of text link
```kotlin
        findViewById<LinkTextView>(R.id.textView).setOnClickListener {
            Toast.makeText(this, "Hello Link", Toast.LENGTH_SHORT).show()
        }
```





