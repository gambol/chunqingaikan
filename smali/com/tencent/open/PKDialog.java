package com.tencent.open; class PKDialog { void a() { int a;
a=0;// .class public Lcom/tencent/open/PKDialog;
a=0;// .super Lcom/tencent/open/b;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/open/b/a$a;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/open/PKDialog$1;,
a=0;//         Lcom/tencent/open/PKDialog$OnTimeListener;,
a=0;//         Lcom/tencent/open/PKDialog$THandler;,
a=0;//         Lcom/tencent/open/PKDialog$FbWebViewClient;,
a=0;//         Lcom/tencent/open/PKDialog$JsListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MSG_CANCEL:I = 0x2
a=0;// 
a=0;// .field private static final MSG_COMPLETE:I = 0x1
a=0;// 
a=0;// .field private static final MSG_ON_LOAD:I = 0x4
a=0;// 
a=0;// .field private static final MSG_SHOW_PROCESS:I = 0x5
a=0;// 
a=0;// .field private static final MSG_SHOW_TIPS:I = 0x3
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private static final WEBVIEW_HEIGHT:I = 0xb9
a=0;// 
a=0;// .field static sToast:Landroid/widget/Toast;
a=0;// 
a=0;// .field private static sWeakContext:Ljava/lang/ref/WeakReference;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ref/WeakReference",
a=0;//             "<",
a=0;//             "Landroid/content/Context;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private listener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field private mFlMain:Lcom/tencent/open/b/a;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mListener:Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;// .field private mUrl:Ljava/lang/String;
a=0;// 
a=0;// .field private mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;// .field private mWebviewHeight:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     const-class v0, Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 323
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     const v0, 0x1030010
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/tencent/open/b;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 82
a=0;//     #p0=(Reference,Lcom/tencent/open/PKDialog;);
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     sput-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 83
a=0;//     iput-object p3, p0, Lcom/tencent/open/PKDialog;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v0, Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/PKDialog$OnTimeListener;);
a=0;//     invoke-virtual {p5}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/open/PKDialog$OnTimeListener;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog$OnTimeListener;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/PKDialog;->mListener:Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v0, Lcom/tencent/open/PKDialog$THandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/PKDialog$THandler;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/PKDialog;->mListener:Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/tencent/open/PKDialog$THandler;-><init>(Lcom/tencent/open/PKDialog$OnTimeListener;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog$THandler;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/PKDialog;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 86
a=0;//     iput-object p4, p0, Lcom/tencent/open/PKDialog;->listener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 87
a=0;//     const/high16 v0, 0x43390000    # 185.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I
a=0;// 
a=0;//     .line 88
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "density="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "; webviewHeight="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Lcom/tencent/open/PKDialog;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400()Ljava/lang/ref/WeakReference;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mListener:Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog$OnTimeListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Lcom/tencent/open/PKDialog;)Landroid/webkit/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$800(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-static {p0, p1}, Lcom/tencent/open/PKDialog;->showTips(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$900(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-static {p0, p1}, Lcom/tencent/open/PKDialog;->showProcessDialog(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private createViews()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 110
a=0;//     #v5=(Byte);
a=0;//     new-instance v1, Lcom/tencent/open/b/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/b/a;);
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Lcom/tencent/open/b/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/b/a;);
a=0;//     iput-object v1, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/b/a;
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/b/a;
a=0;// 
a=0;//     const/high16 v1, 0x66000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/b/a;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/b/a;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/b/a;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v1, Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/webkit/WebView;);
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     iput-object v1, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 119
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     :try_start_0
a=0;//     const-class v0, Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     const-string v1, "setLayerType"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-class v4, Landroid/graphics/Paint;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v1, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-instance v4, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Paint;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget v1, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, v5, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v1, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/b/a;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/b/a;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/b/a;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/tencent/open/b/a;->a(Lcom/tencent/open/b/a$a;)V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/b/a;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/PKDialog;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// 
a=0;//     .line 123
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 124
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initViews()V
a=0;//     .locals 6
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "SetJavaScriptEnabled"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 144
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/open/PKDialog$FbWebViewClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/PKDialog$FbWebViewClient;);
a=0;//     invoke-direct {v1, p0, v5}, Lcom/tencent/open/PKDialog$FbWebViewClient;-><init>(Lcom/tencent/open/PKDialog;Lcom/tencent/open/PKDialog$1;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/PKDialog$FbWebViewClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/PKDialog;->mChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 152
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 158
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V
a=0;// 
a=0;//     .line 159
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
a=0;// 
a=0;//     .line 162
a=0;//     sget-object v0, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings$RenderPriority;);
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 165
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V
a=0;// 
a=0;//     .line 167
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "databases"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
a=0;// 
a=0;//     .line 193
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->jsBridge:Lcom/tencent/open/a;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/open/PKDialog$JsListener;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/PKDialog$JsListener;);
a=0;//     invoke-direct {v1, p0, v5}, Lcom/tencent/open/PKDialog$JsListener;-><init>(Lcom/tencent/open/PKDialog;Lcom/tencent/open/PKDialog$1;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/PKDialog$JsListener;);
a=0;//     const-string v2, "sdk_js_if"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/open/a;->a(Lcom/tencent/open/a$b;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->clearView()V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/PKDialog;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
a=0;// 
a=0;//     .line 198
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private loadUrlWithBrowser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 401
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v0, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 402
a=0;//     const-string v0, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 403
a=0;//     const/high16 v0, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 404
a=0;//     const/high16 v0, 0x10000000
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 406
a=0;//     invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 408
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 409
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 412
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static showProcessDialog(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 396
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 365
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 366
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "action"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 367
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "msg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 368
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 392
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 394
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static showTips(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 328
a=0;//     :try_start_0
a=0;//     #v3=(One);
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 329
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 331
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "msg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 333
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 334
a=0;//     sget-object v1, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 335
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     .line 342
a=0;//     :goto_0
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 358
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 338
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/widget/Toast;);v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Toast;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 339
a=0;//     sget-object v1, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 340
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 354
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 356
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 343
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Reference,Ljava/lang/String;);
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     .line 344
a=0;//     :try_start_1
a=0;//     sget-object v1, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 345
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     .line 352
a=0;//     :goto_2
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 348
a=0;//     :cond_3
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     sget-object v1, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Toast;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 349
a=0;//     sget-object v1, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 350
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callJs(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "javascript:"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "("
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ")"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v1, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-super {p0}, Lcom/tencent/open/b;->onBackPressed()V
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onConsoleMessage(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 546
a=0;//     const-string v0, "PKDialog"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "--onConsoleMessage--"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 548
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->jsBridge:Lcom/tencent/open/a;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/tencent/open/a;->a(Landroid/webkit/WebView;Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 552
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 549
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 99
a=0;//     #v2=(One);
a=0;//     invoke-super {p0, p1}, Lcom/tencent/open/b;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {p0, v2}, Lcom/tencent/open/PKDialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/PKDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Window;);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/PKDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/Window;->setSoftInputMode(I)V
a=0;// 
a=0;//     .line 104
a=0;//     invoke-direct {p0}, Lcom/tencent/open/PKDialog;->createViews()V
a=0;// 
a=0;//     .line 105
a=0;//     invoke-direct {p0}, Lcom/tencent/open/PKDialog;->initViews()V
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyboardHidden()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 541
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "keyboard hide"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 542
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyboardShown(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 523
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 524
a=0;//     iget v0, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p1, v0, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->sWeakContext:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v1, v0, :cond_1
a=0;// 
a=0;//     .line 527
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 532
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "keyboard show"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 533
a=0;//     return-void
a=0;// 
a=0;//     .line 529
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
