package com.tencent.connect.auth; class AuthDialog { void a() { int a;
a=0;// .class public Lcom/tencent/connect/auth/AuthDialog;
a=0;// .super Landroid/app/Dialog;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/connect/auth/AuthDialog$1;,
a=0;//         Lcom/tencent/connect/auth/AuthDialog$JsListener;,
a=0;//         Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;,
a=0;//         Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;,
a=0;//         Lcom/tencent/connect/auth/AuthDialog$THandler;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/lang/ref/WeakReference;
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
a=0;// .field private static l:Ljava/lang/ref/WeakReference;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ref/WeakReference",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;// .field private d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field private e:Landroid/os/Handler;
a=0;// 
a=0;// .field private f:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private g:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private h:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private i:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private j:Ljava/lang/String;
a=0;// 
a=0;// .field private k:Landroid/webkit/WebView;
a=0;// 
a=0;// .field private m:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     const v0, 0x1030010
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthDialog;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/connect/auth/AuthDialog;->m:Z
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     sput-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 80
a=0;//     iput-object p3, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;);
a=0;//     invoke-virtual {p5}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;-><init>(Lcom/tencent/connect/auth/AuthDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->c:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v0, Lcom/tencent/connect/auth/AuthDialog$THandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/AuthDialog$THandler;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->c:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/tencent/connect/auth/AuthDialog$THandler;-><init>(Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog$THandler;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->e:Landroid/os/Handler;
a=0;// 
a=0;//     .line 83
a=0;//     iput-object p4, p0, Lcom/tencent/connect/auth/AuthDialog;->d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 84
a=0;//     iput-object p2, p0, Lcom/tencent/connect/auth/AuthDialog;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/auth/AuthDialog;Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Ljava/lang/ref/WeakReference;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-static {p0, p1}, Lcom/tencent/connect/auth/AuthDialog;->b(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/auth/AuthDialog;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/auth/AuthDialog;->f()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/auth/AuthDialog;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iput-boolean p1, p0, Lcom/tencent/connect/auth/AuthDialog;->m:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()Ljava/lang/ref/WeakReference;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->l:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 483
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 485
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "msg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 486
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 487
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 491
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 488
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 489
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/connect/auth/AuthDialog;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-boolean v0, p0, Lcom/tencent/connect/auth/AuthDialog;->m:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/tencent/connect/auth/AuthDialog;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 332
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/auth/AuthDialog;->d()V
a=0;// 
a=0;//     .line 333
a=0;//     new-instance v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 336
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     new-instance v2, Landroid/webkit/WebView;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/webkit/WebView;);
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v2, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/webkit/WebView;);
a=0;//     iput-object v2, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 339
a=0;//     new-instance v2, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/FrameLayout;);
a=0;//     iput-object v2, p0, Lcom/tencent/connect/auth/AuthDialog;->f:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 340
a=0;//     const/16 v0, 0x11
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->f:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->f:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 344
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->f:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->h:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 345
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->h:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     sput-object v0, Lcom/tencent/connect/auth/AuthDialog;->l:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 347
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->f:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/auth/AuthDialog;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 348
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/tencent/connect/auth/AuthDialog;)Landroid/webkit/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0x50
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/16 v7, 0x28
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/16 v6, 0x11
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/16 v5, 0xff
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     .line 351
a=0;//     #v4=(Byte);
a=0;//     new-instance v1, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/ProgressBar;);
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ProgressBar;);
a=0;//     iput-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->i:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 352
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 355
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->i:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 356
a=0;//     new-instance v1, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iput-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->g:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 357
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 358
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->j:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "action_login"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 359
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 362
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 363
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 364
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 365
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 366
a=0;//     const-string v3, "zh"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 367
a=0;//     const-string v0, "\u767b\u5f55\u4e2d..."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 371
a=0;//     :goto_0
a=0;//     invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 372
a=0;//     const/high16 v0, 0x41900000    # 18.0f
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 373
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 376
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/TextView;);v1=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 379
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     iput v6, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog;->g:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 381
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->g:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog;->i:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 382
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->g:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 385
a=0;//     :cond_1
a=0;//     new-instance v1, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout;);
a=0;//     iput-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->h:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 386
a=0;//     new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {v0, v1, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 389
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     iput v8, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 390
a=0;//     iput v8, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 391
a=0;//     iput v7, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 392
a=0;//     iput v7, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     .line 393
a=0;//     iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->h:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 395
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->h:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     const/high16 v1, 0x1080000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 396
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->h:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->g:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 397
a=0;//     return-void
a=0;// 
a=0;//     .line 369
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "Logging in..."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/tencent/connect/auth/AuthDialog;)Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->c:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 7
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "SetJavaScriptEnabled"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 403
a=0;//     #v6=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0, v6}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 404
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 405
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;-><init>(Lcom/tencent/connect/auth/AuthDialog;Lcom/tencent/connect/auth/AuthDialog$1;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/AuthDialog$LoginWebViewClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
a=0;// 
a=0;//     .line 406
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     new-instance v1, Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/webkit/WebChromeClient;);
a=0;//     invoke-direct {v1}, Landroid/webkit/WebChromeClient;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebChromeClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 411
a=0;//     invoke-virtual {v1, v6}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
a=0;// 
a=0;//     .line 412
a=0;//     invoke-virtual {v1, v6}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
a=0;// 
a=0;//     .line 414
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 417
a=0;//     invoke-virtual {v1, v6}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V
a=0;// 
a=0;//     .line 418
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
a=0;// 
a=0;//     .line 419
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
a=0;// 
a=0;//     .line 421
a=0;//     sget-object v0, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings$RenderPriority;);
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V
a=0;// 
a=0;//     .line 422
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 424
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V
a=0;// 
a=0;//     .line 426
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
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
a=0;//     invoke-virtual {v0, v2, v6}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 429
a=0;//     :cond_0
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
a=0;// 
a=0;//     .line 433
a=0;//     :try_start_0
a=0;//     const-class v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     const-string v1, "addJavascriptInterface"
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-class v4, Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-class v4, Ljava/lang/String;
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
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
a=0;//     new-instance v4, Lcom/tencent/connect/auth/AuthDialog$JsListener;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/connect/auth/AuthDialog$JsListener;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v4, p0, v5}, Lcom/tencent/connect/auth/AuthDialog$JsListener;-><init>(Lcom/tencent/connect/auth/AuthDialog;Lcom/tencent/connect/auth/AuthDialog$1;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/connect/auth/AuthDialog$JsListener;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "sdk_js_if"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
a=0;// 
a=0;//     .line 452
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 454
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
a=0;// 
a=0;//     .line 456
a=0;//     return-void
a=0;// 
a=0;//     .line 435
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 437
a=0;//     invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 438
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 440
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 441
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 443
a=0;//     invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 444
a=0;//     :catch_3
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 446
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 447
a=0;//     :catch_4
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 448
a=0;//     const-string v1, "AuthDialog"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcom/tencent/connect/auth/AuthDialog;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->e:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private f()Z
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 459
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthMap;->getInstance()Lcom/tencent/connect/auth/AuthMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 460
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/AuthMap;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/AuthMap;->makeKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 461
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lcom/tencent/connect/auth/AuthMap$Auth;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/connect/auth/AuthMap$Auth;);
a=0;//     invoke-direct {v3}, Lcom/tencent/connect/auth/AuthMap$Auth;-><init>()V
a=0;// 
a=0;//     .line 462
a=0;//     #v3=(Reference,Lcom/tencent/connect/auth/AuthMap$Auth;);
a=0;//     iget-object v4, p0, Lcom/tencent/connect/auth/AuthDialog;->d:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     iput-object v4, v3, Lcom/tencent/connect/auth/AuthMap$Auth;->listener:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 463
a=0;//     iput-object p0, v3, Lcom/tencent/connect/auth/AuthMap$Auth;->dialog:Lcom/tencent/connect/auth/AuthDialog;
a=0;// 
a=0;//     .line 464
a=0;//     iput-object v2, v3, Lcom/tencent/connect/auth/AuthMap$Auth;->key:Ljava/lang/String;
a=0;// 
a=0;//     .line 465
a=0;//     invoke-virtual {v1, v3}, Lcom/tencent/connect/auth/AuthMap;->set(Lcom/tencent/connect/auth/AuthMap$Auth;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 466
a=0;//     iget-object v3, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v5, "?"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v4, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/tencent/utils/Util;->parseUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 468
a=0;//     const-string v5, "token_key"
a=0;// 
a=0;//     invoke-virtual {v4, v5, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 469
a=0;//     const-string v2, "serial"
a=0;// 
a=0;//     invoke-virtual {v4, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 470
a=0;//     const-string v1, "browser"
a=0;// 
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     invoke-virtual {v4, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 471
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "?"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v4}, Lcom/tencent/utils/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 472
a=0;//     sget-object v1, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 473
a=0;//     sget-object v0, Lcom/tencent/connect/auth/AuthDialog;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/utils/Util;->openBrowser(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 475
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public callJs(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 494
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
a=0;//     const-string v1, ");void("
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ");"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 495
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog;->k:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 496
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-boolean v0, p0, Lcom/tencent/connect/auth/AuthDialog;->m:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog;->c:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onCancel()V
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 90
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/auth/AuthDialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 91
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/auth/AuthDialog;->c()V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/auth/AuthDialog;->e()V
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
}}
