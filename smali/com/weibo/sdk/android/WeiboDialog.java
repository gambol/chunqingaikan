package com.weibo.sdk.android; class WeiboDialog { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/WeiboDialog;
a=0;// .super Landroid/app/Dialog;
a=0;// .source "WeiboDialog.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static FILL:Landroid/widget/FrameLayout$LayoutParams; = null
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "Weibo-WebView"
a=0;// 
a=0;// .field private static bottom_margin:I
a=0;// 
a=0;// .field private static left_margin:I
a=0;// 
a=0;// .field private static right_margin:I
a=0;// 
a=0;// .field private static theme:I
a=0;// 
a=0;// .field private static top_margin:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContent:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private mListener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;// .field private mSpinner:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private mUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;// .field private webViewContainer:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     sput-object v0, Lcom/weibo/sdk/android/WeiboDialog;->FILL:Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 59
a=0;//     const v0, 0x1030010
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/weibo/sdk/android/WeiboDialog;->theme:I
a=0;// 
a=0;//     .line 60
a=0;//     sput v1, Lcom/weibo/sdk/android/WeiboDialog;->left_margin:I
a=0;// 
a=0;//     .line 61
a=0;//     sput v1, Lcom/weibo/sdk/android/WeiboDialog;->top_margin:I
a=0;// 
a=0;//     .line 62
a=0;//     sput v1, Lcom/weibo/sdk/android/WeiboDialog;->right_margin:I
a=0;// 
a=0;//     .line 63
a=0;//     sput v1, Lcom/weibo/sdk/android/WeiboDialog;->bottom_margin:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     sget v0, Lcom/weibo/sdk/android/WeiboDialog;->theme:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 67
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/WeiboDialog;);
a=0;//     iput-object p2, p0, Lcom/weibo/sdk/android/WeiboDialog;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 68
a=0;//     iput-object p3, p0, Lcom/weibo/sdk/android/WeiboDialog;->mListener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/weibo/sdk/android/WeiboDialog;)Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mListener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboAuthListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/weibo/sdk/android/WeiboDialog;Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     invoke-direct {p0, p1, p2}, Lcom/weibo/sdk/android/WeiboDialog;->handleRedirectUrl(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/weibo/sdk/android/WeiboDialog;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mSpinner:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/weibo/sdk/android/WeiboDialog;)Landroid/webkit/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private handleRedirectUrl(Landroid/webkit/WebView;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "view"    # Landroid/webkit/WebView;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     invoke-static {p2}, Lcom/weibo/sdk/android/util/Utility;->parseUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 230
a=0;//     .local v2, "values":Landroid/os/Bundle;
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v3, "error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 231
a=0;//     .local v0, "error":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "error_code"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 233
a=0;//     .local v1, "error_code":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v3, p0, Lcom/weibo/sdk/android/WeiboDialog;->mListener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     invoke-interface {v3, v2}, Lcom/weibo/sdk/android/WeiboAuthListener;->onComplete(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 246
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     const-string v3, "access_denied"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v3, p0, Lcom/weibo/sdk/android/WeiboDialog;->mListener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/weibo/sdk/android/WeiboAuthListener;);
a=0;//     invoke-interface {v3}, Lcom/weibo/sdk/android/WeiboAuthListener;->onCancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 239
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v3, p0, Lcom/weibo/sdk/android/WeiboDialog;->mListener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/weibo/sdk/android/WeiboAuthListener;);
a=0;//     new-instance v4, Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v4, v0, v5}, Lcom/weibo/sdk/android/WeiboException;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-interface {v3, v4}, Lcom/weibo/sdk/android/WeiboAuthListener;->onWeiboException(Lcom/weibo/sdk/android/WeiboException;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 242
a=0;//     :cond_2
a=0;//     #v3=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v3, p0, Lcom/weibo/sdk/android/WeiboDialog;->mListener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/weibo/sdk/android/WeiboAuthListener;);
a=0;//     new-instance v4, Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v4, v0, v5}, Lcom/weibo/sdk/android/WeiboException;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-interface {v3, v4}, Lcom/weibo/sdk/android/WeiboAuthListener;->onWeiboException(Lcom/weibo/sdk/android/WeiboException;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private parseDimens()Z
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 250
a=0;//     .local v7, "ret":Z
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v10}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 251
a=0;//     .local v0, "asseets":Landroid/content/res/AssetManager;
a=0;//     #v0=(Reference,Landroid/content/res/AssetManager;);
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 252
a=0;//     .local v2, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v2=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v1, v2, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 253
a=0;//     .local v1, "density":F
a=0;//     #v1=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 255
a=0;//     .local v5, "is":Ljava/io/InputStream;
a=0;//     :try_start_0
a=0;//     #v5=(Null);
a=0;//     const-string v10, "values/dimens.xml"
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 256
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 258
a=0;//     .local v9, "xmlpull":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :try_start_1
a=0;//     #v9=(Reference,Lorg/xmlpull/v1/XmlPullParser;);
a=0;//     const-string v10, "utf-8"
a=0;// 
a=0;//     invoke-interface {v9, v5, v10}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 259
a=0;//     invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;//     :try_end_1
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 260
a=0;//     .local v4, "eventCode":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 261
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);v7=(One);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     if-ne v4, v10, :cond_1
a=0;// 
a=0;//     .line 292
a=0;//     .end local v4    # "eventCode":I
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v7=(Boolean);v10=(Conflicted);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 294
a=0;//     :try_start_2
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
a=0;// 
a=0;//     .line 300
a=0;//     .end local v9    # "xmlpull":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v9=(Conflicted);
a=0;//     return v7
a=0;// 
a=0;//     .line 262
a=0;//     .restart local v4    # "eventCode":I
a=0;//     .restart local v9    # "xmlpull":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :cond_1
a=0;//     #v3=(Uninit);v4=(Integer);v7=(One);v9=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v10=(One);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     .line 282
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     :try_start_3
a=0;//     #v10=(Integer);
a=0;//     invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 264
a=0;//     :pswitch_0
a=0;//     #v10=(One);
a=0;//     invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v11, "dimen"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 265
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const-string v11, "name"
a=0;// 
a=0;//     invoke-interface {v9, v10, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 266
a=0;//     .local v6, "name":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "weibosdk_dialog_left_margin"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     .line 267
a=0;//     invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 268
a=0;//     .local v8, "value":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v10, v1
a=0;// 
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sput v10, Lcom/weibo/sdk/android/WeiboDialog;->left_margin:I
a=0;//     :try_end_3
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 285
a=0;//     .end local v4    # "eventCode":I
a=0;//     .end local v6    # "name":Ljava/lang/String;
a=0;//     .end local v8    # "value":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);v7=(Boolean);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 286
a=0;//     .local v3, "e":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :try_start_4
a=0;//     #v3=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     invoke-virtual {v3}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 289
a=0;//     .end local v3    # "e":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     .end local v9    # "xmlpull":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 290
a=0;//     .local v3, "e":Ljava/io/IOException;
a=0;//     :try_start_5
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 292
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 294
a=0;//     :try_start_6
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 295
a=0;//     :catch_2
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 269
a=0;//     .end local v3    # "e":Ljava/io/IOException;
a=0;//     .restart local v4    # "eventCode":I
a=0;//     .restart local v6    # "name":Ljava/lang/String;
a=0;//     .restart local v9    # "xmlpull":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :cond_3
a=0;//     :try_start_7
a=0;//     #v3=(Uninit);v4=(Integer);v6=(Reference,Ljava/lang/String;);v7=(One);v9=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v10=(Boolean);v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "weibosdk_dialog_top_margin"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     .line 270
a=0;//     invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 271
a=0;//     .restart local v8    # "value":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v10, v1
a=0;// 
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sput v10, Lcom/weibo/sdk/android/WeiboDialog;->top_margin:I
a=0;//     :try_end_7
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 291
a=0;//     .end local v4    # "eventCode":I
a=0;//     .end local v6    # "name":Ljava/lang/String;
a=0;//     .end local v8    # "value":Ljava/lang/String;
a=0;//     .end local v9    # "xmlpull":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :catchall_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Boolean);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v10
a=0;// 
a=0;//     .line 292
a=0;//     #v10=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 294
a=0;//     :try_start_8
a=0;//     invoke-virtual {v5}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
a=0;// 
a=0;//     .line 299
a=0;//     :cond_4
a=0;//     :goto_4
a=0;//     throw v10
a=0;// 
a=0;//     .line 272
a=0;//     .restart local v4    # "eventCode":I
a=0;//     .restart local v6    # "name":Ljava/lang/String;
a=0;//     .restart local v9    # "xmlpull":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :cond_5
a=0;//     :try_start_9
a=0;//     #v3=(Uninit);v4=(Integer);v6=(Reference,Ljava/lang/String;);v7=(One);v9=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v10=(Boolean);v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "weibosdk_dialog_right_margin"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_6
a=0;// 
a=0;//     .line 273
a=0;//     invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 274
a=0;//     .restart local v8    # "value":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v10, v1
a=0;// 
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sput v10, Lcom/weibo/sdk/android/WeiboDialog;->right_margin:I
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 275
a=0;//     .end local v8    # "value":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v8=(Conflicted);v10=(Boolean);
a=0;//     const-string v10, "weibosdk_dialog_bottom_margin"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 276
a=0;//     invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 277
a=0;//     .restart local v8    # "value":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v10, v1
a=0;// 
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sput v10, Lcom/weibo/sdk/android/WeiboDialog;->bottom_margin:I
a=0;//     :try_end_9
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_9 .. :try_end_9} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 295
a=0;//     .end local v4    # "eventCode":I
a=0;//     .end local v6    # "name":Ljava/lang/String;
a=0;//     .end local v8    # "value":Ljava/lang/String;
a=0;//     .end local v9    # "xmlpull":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :catch_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Boolean);v8=(Conflicted);v9=(Conflicted);v10=(Reference,Ljava/lang/Throwable;);v11=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 296
a=0;//     .restart local v3    # "e":Ljava/io/IOException;
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 295
a=0;//     .end local v3    # "e":Ljava/io/IOException;
a=0;//     .restart local v9    # "xmlpull":Lorg/xmlpull/v1/XmlPullParser;
a=0;//     :catch_4
a=0;//     #v3=(Conflicted);v9=(Reference,Lorg/xmlpull/v1/XmlPullParser;);v10=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 296
a=0;//     .restart local v3    # "e":Ljava/io/IOException;
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 262
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private setUpWebView()V
a=0;//     .locals 17
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     new-instance v11, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v11, v12}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v11=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboDialog;);
a=0;//     iput-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->webViewContainer:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v11, Landroid/webkit/WebView;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/webkit/WebView;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-direct {v11, v12}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v11=(Reference,Landroid/webkit/WebView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 110
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v11, v12}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 111
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 112
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v11}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     invoke-virtual {v11, v12}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 113
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     new-instance v12, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v12, v0, v13}, Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;-><init>(Lcom/weibo/sdk/android/WeiboDialog;Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;)V
a=0;// 
a=0;//     #v12=(Reference,Lcom/weibo/sdk/android/WeiboDialog$WeiboWebViewClient;);
a=0;//     invoke-virtual {v11, v12}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
a=0;// 
a=0;//     .line 114
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/weibo/sdk/android/WeiboDialog;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 115
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     sget-object v12, Lcom/weibo/sdk/android/WeiboDialog;->FILL:Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 116
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     const/4 v12, 0x4
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v11, v12}, Landroid/webkit/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 118
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v11}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     const/4 v12, -0x1
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     invoke-direct {v7, v11, v12}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 122
a=0;//     .local v7, "lp":Landroid/widget/RelativeLayout$LayoutParams;
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     const/4 v12, -0x1
a=0;// 
a=0;//     invoke-direct {v8, v11, v12}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 124
a=0;//     .local v8, "lp0":Landroid/widget/RelativeLayout$LayoutParams;
a=0;//     #v8=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mContent:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v11=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {v11, v12}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 125
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 126
a=0;//     .local v1, "asseets":Landroid/content/res/AssetManager;
a=0;//     #v1=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 129
a=0;//     .local v6, "is":Ljava/io/InputStream;
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     const-string v11, "weibosdk_dialog_bg.9.png"
a=0;// 
a=0;//     invoke-virtual {v1, v11}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 130
a=0;//     #v6=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 131
a=0;//     .local v4, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v4=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v3, v4, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 132
a=0;//     .local v3, "density":F
a=0;//     #v3=(Integer);
a=0;//     const/high16 v11, 0x41200000    # 10.0f
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     mul-float/2addr v11, v3
a=0;// 
a=0;//     #v11=(Float);
a=0;//     float-to-int v11, v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iput v11, v8, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 133
a=0;//     const/high16 v11, 0x41200000    # 10.0f
a=0;// 
a=0;//     mul-float/2addr v11, v3
a=0;// 
a=0;//     #v11=(Float);
a=0;//     float-to-int v11, v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iput v11, v8, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 134
a=0;//     const/high16 v11, 0x41200000    # 10.0f
a=0;// 
a=0;//     mul-float/2addr v11, v3
a=0;// 
a=0;//     #v11=(Float);
a=0;//     float-to-int v11, v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iput v11, v8, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 135
a=0;//     const/high16 v11, 0x41200000    # 10.0f
a=0;// 
a=0;//     mul-float/2addr v11, v3
a=0;// 
a=0;//     #v11=(Float);
a=0;//     float-to-int v11, v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iput v11, v8, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 139
a=0;//     .end local v3    # "density":F
a=0;//     .end local v4    # "dm":Landroid/util/DisplayMetrics;
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v11=(Conflicted);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 140
a=0;//     :try_start_1
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->webViewContainer:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v11=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     sget v12, Lcom/twocloo/base/R$drawable;->weibosdk_dialog_bg:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v11, v12}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 149
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v9=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     :try_start_2
a=0;//     invoke-virtual {v6}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
a=0;// 
a=0;//     .line 158
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v11=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->webViewContainer:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v11=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v12=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v11, v12, v8}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 159
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->webViewContainer:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v12, 0x11
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v11, v12}, Landroid/widget/RelativeLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 161
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/weibo/sdk/android/WeiboDialog;->parseDimens()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_3
a=0;// 
a=0;//     .line 162
a=0;//     sget v11, Lcom/weibo/sdk/android/WeiboDialog;->left_margin:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iput v11, v7, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 163
a=0;//     sget v11, Lcom/weibo/sdk/android/WeiboDialog;->top_margin:I
a=0;// 
a=0;//     iput v11, v7, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 164
a=0;//     sget v11, Lcom/weibo/sdk/android/WeiboDialog;->right_margin:I
a=0;// 
a=0;//     iput v11, v7, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 165
a=0;//     sget v11, Lcom/weibo/sdk/android/WeiboDialog;->bottom_margin:I
a=0;// 
a=0;//     iput v11, v7, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     .line 173
a=0;//     :goto_3
a=0;//     #v10=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->mContent:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v11=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/weibo/sdk/android/WeiboDialog;->webViewContainer:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v12=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v11, v12, v7}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// 
a=0;//     .line 136
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v5=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Conflicted);v12=(Null);v14=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 137
a=0;//     .local v5, "e":Ljava/lang/Exception;
a=0;//     :try_start_3
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     .end local v5    # "e":Ljava/lang/Exception;
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);v9=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 147
a=0;//     .restart local v5    # "e":Ljava/lang/Exception;
a=0;//     :try_start_4
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 149
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     :try_start_5
a=0;//     invoke-virtual {v6}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 152
a=0;//     :catch_2
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 153
a=0;//     .local v5, "e":Ljava/io/IOException;
a=0;//     invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 142
a=0;//     .end local v5    # "e":Ljava/io/IOException;
a=0;//     :cond_1
a=0;//     :try_start_6
a=0;//     #v2=(Uninit);v5=(Conflicted);v9=(Uninit);v12=(Null);v14=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     invoke-static {v6}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 143
a=0;//     .local v2, "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v9, Landroid/graphics/drawable/NinePatchDrawable;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/graphics/drawable/NinePatchDrawable;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,[B);
a=0;//     new-instance v12, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/graphics/Rect;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     invoke-direct/range {v12 .. v16}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v12=(Reference,Landroid/graphics/Rect;);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     invoke-direct {v9, v2, v11, v12, v13}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 144
a=0;//     .local v9, "npd":Landroid/graphics/drawable/NinePatchDrawable;
a=0;//     #v9=(Reference,Landroid/graphics/drawable/NinePatchDrawable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/weibo/sdk/android/WeiboDialog;->webViewContainer:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v11, v9}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 148
a=0;//     .end local v2    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     .end local v9    # "npd":Landroid/graphics/drawable/NinePatchDrawable;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 149
a=0;//     #v11=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 151
a=0;//     :try_start_7
a=0;//     invoke-virtual {v6}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
a=0;// 
a=0;//     .line 156
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     throw v11
a=0;// 
a=0;//     .line 152
a=0;//     :catch_3
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 153
a=0;//     .restart local v5    # "e":Ljava/io/IOException;
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 152
a=0;//     .end local v5    # "e":Ljava/io/IOException;
a=0;//     :catch_4
a=0;//     #v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 153
a=0;//     .restart local v5    # "e":Ljava/io/IOException;
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 167
a=0;//     .end local v5    # "e":Ljava/io/IOException;
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v11=(Boolean);v12=(PosByte);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 168
a=0;//     .local v10, "resources":Landroid/content/res/Resources;
a=0;//     #v10=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v11, Lcom/twocloo/base/R$dimen;->weibosdk_dialog_left_margin:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     iput v11, v7, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 169
a=0;//     sget v11, Lcom/twocloo/base/R$dimen;->weibosdk_dialog_right_margin:I
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     iput v11, v7, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 170
a=0;//     sget v11, Lcom/twocloo/base/R$dimen;->weibosdk_dialog_top_margin:I
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     iput v11, v7, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 171
a=0;//     sget v11, Lcom/twocloo/base/R$dimen;->weibosdk_dialog_bottom_margin:I
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     iput v11, v7, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onBack()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mSpinner:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/WeiboDialog;->dismiss()V
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// 
a=0;//     .line 102
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 5
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 74
a=0;//     #v2=(Byte);
a=0;//     invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     iput-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mSpinner:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mSpinner:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/app/ProgressDialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mSpinner:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     const-string v1, "Loading..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mSpinner:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     new-instance v1, Lcom/weibo/sdk/android/WeiboDialog$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/WeiboDialog$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/weibo/sdk/android/WeiboDialog$1;-><init>(Lcom/weibo/sdk/android/WeiboDialog;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/WeiboDialog$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {p0, v4}, Lcom/weibo/sdk/android/WeiboDialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/WeiboDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setFeatureDrawableAlpha(II)V
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {p0}, Lcom/weibo/sdk/android/WeiboDialog;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iput-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mContent:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 90
a=0;//     invoke-direct {p0}, Lcom/weibo/sdk/android/WeiboDialog;->setUpWebView()V
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/WeiboDialog;->mContent:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/weibo/sdk/android/WeiboDialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
}}
