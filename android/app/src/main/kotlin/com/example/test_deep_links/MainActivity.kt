package com.example.test_deep_links

import android.content.Intent
import android.os.Bundle
import android.util.Log
import io.flutter.embedding.android.FlutterActivity

private const val TAG = "flutter: MainActivity"

class MainActivity : FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    Log.i(TAG, "onCreate: intent = $intent")
    super.onCreate(savedInstanceState)
  }

  override fun onNewIntent(intent: Intent) {
    Log.i(TAG, "onNewIntent: intent = $intent")
    super.onNewIntent(intent)
  }
}
