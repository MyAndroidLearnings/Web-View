# Android WebView Kotlin

### Introduction:

This project is created with intention to understand the Android WebView
and can be readily use as a component to easily integrate with projects


------------------------------------------------------------------------

### Installation:

No Specific Installation is needed.

------------------------------------------------------------------------

### Configuration:

Initialize the webview URL and the zoom level 

```
val url = "https://www.google.com"
val zoomLevel = 150
```


------------------------------------------------------------------------

### Handler Part:

#### Initialization
```
    fun webViewSetup() {
        mywebview = findViewById<WebView>(R.id.webview)
        mywebview!!.setWebChromeClient(WebChromeClient())
        mywebview!!.getSettings().setDomStorageEnabled(true)
        mywebview!!.setInitialScale(zoomLevel)


        mywebview!!.settings.javaScriptEnabled = true
        mywebview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
    }
``` 

#### WebView Loading

```
fun loadWebView() {
        mywebview!!.loadUrl(urlEncoded)
  }

```

#### XML Part

You can include the Webview in your layout by using following code

```
    <WebView
            android:id="@+id/webview"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="30dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />
```

------------------------------------------------------------------------

### Usage / Example -

You can use this component in three ways

#### As a component

1) Invoke the initialization function in the Activity : 

In Oncreate method of the activity
```
webViewSetup()
```

In Onstart method fo the activity

```
loadWebView()
```

2) Include below xml component in layout file and adjust its position 
(if needed)

```
<WebView
            android:id="@+id/webview"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="30dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />
```


#### As an Individual Activity

You can readily use WebViewActivity.kt and activity_webview.xml in your 
project for the Integration


#### As a standalone Project

You can take a clone of this project and can use it readily.


