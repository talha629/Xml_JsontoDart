package com.example.talhaaits.jsonparsing;

import android.support.annotation.Nullable;

import com.tickaroo.tikxml.annotation.TextContent;
import com.tickaroo.tikxml.annotation.Xml;

@Xml(name = "embeddedCode")
public class EmbeddedCode {
    @Nullable
    @TextContent
    String text;
}
