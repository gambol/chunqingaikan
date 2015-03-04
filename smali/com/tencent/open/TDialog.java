package com.tencent.open; class TDialog { void a() { int a;
a=0;// .class public Lcom/tencent/open/TDialog;
a=0;// .super Lcom/tencent/open/b;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/open/TDialog$1;,
a=0;//         Lcom/tencent/open/TDialog$FbWebViewClient;,
a=0;//         Lcom/tencent/open/TDialog$JsListener;,
a=0;//         Lcom/tencent/open/TDialog$OnTimeListener;,
a=0;//         Lcom/tencent/open/TDialog$THandler;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final a:Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;// .field static b:Landroid/widget/Toast;
a=0;// 
a=0;// .field private static c:Ljava/lang/ref/WeakReference;
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
a=0;// .field private static d:Ljava/lang/ref/WeakReference;
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
a=0;// .field private static e:Ljava/lang/ref/WeakReference;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ref/WeakReference",
a=0;//             "<",
a=0;//             "Landroid/app/ProgressDialog;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;// .field private h:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field private i:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private j:Landroid/webkit/WebView;
a=0;// 
a=0;// .field private k:Landroid/widget/FrameLayout;
a=0;// 
a=0;// .field private l:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private m:Landroid/os/Handler;
a=0;// 
a=0;// .field private n:Z
a=0;// 
a=0;// .field private o:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 55
a=0;//     #v1=(Byte);
a=0;//     new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     sput-object v0, Lcom/tencent/open/TDialog;->a:Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 523
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     const v0, 0x1030010
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/tencent/open/b;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 97
a=0;//     #p0=(Reference,Lcom/tencent/open/TDialog;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/open/TDialog;->n:Z
a=0;// 
a=0;//     .line 99
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/open/TDialog;->o:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     .line 204
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     sput-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 205
a=0;//     iput-object p3, p0, Lcom/tencent/open/TDialog;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 206
a=0;//     new-instance v0, Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/TDialog$OnTimeListener;);
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
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/open/TDialog$OnTimeListener;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TDialog$OnTimeListener;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/TDialog;->g:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;//     .line 207
a=0;//     new-instance v0, Lcom/tencent/open/TDialog$THandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/TDialog$THandler;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->g:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/tencent/open/TDialog$THandler;-><init>(Lcom/tencent/open/TDialog$OnTimeListener;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TDialog$THandler;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/TDialog;->m:Landroid/os/Handler;
a=0;// 
a=0;//     .line 208
a=0;//     iput-object p4, p0, Lcom/tencent/open/TDialog;->h:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 209
a=0;//     iput-object p5, p0, Lcom/tencent/open/TDialog;->o:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     .line 210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/open/TDialog;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->m:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Ljava/lang/ref/WeakReference;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-static {p0, p1}, Lcom/tencent/open/TDialog;->c(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/open/TDialog;)Lcom/tencent/open/TDialog$OnTimeListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->g:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TDialog$OnTimeListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()Ljava/lang/ref/WeakReference;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-static {p0, p1}, Lcom/tencent/open/TDialog;->d(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/tencent/open/TDialog;)Landroid/webkit/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x50
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/16 v5, 0x28
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/16 v4, 0x11
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     .line 232
a=0;//     #v2=(Byte);
a=0;//     new-instance v1, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/ProgressBar;);
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
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
a=0;//     iput-object v1, p0, Lcom/tencent/open/TDialog;->l:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 233
a=0;//     new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 236
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->l:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 238
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 239
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v0, "test"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 240
a=0;//     new-instance v1, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
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
a=0;//     iput-object v1, p0, Lcom/tencent/open/TDialog;->k:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 241
a=0;//     new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 244
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     .line 245
a=0;//     iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 246
a=0;//     iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 247
a=0;//     iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 248
a=0;//     iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->k:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->k:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     const/high16 v1, 0x1080000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->k:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->l:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 254
a=0;//     new-instance v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 257
a=0;//     #v1=(Reference,Landroid/widget/FrameLayout$LayoutParams;);
a=0;//     new-instance v2, Landroid/webkit/WebView;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/webkit/WebView;);
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v2, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/webkit/WebView;);
a=0;//     iput-object v2, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 258
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 260
a=0;//     new-instance v2, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
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
a=0;//     iput-object v2, p0, Lcom/tencent/open/TDialog;->i:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     .line 261
a=0;//     iput v4, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->k:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 266
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->k:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     sput-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Landroid/widget/FrameLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/TDialog;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 270
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static c(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 528
a=0;//     :try_start_0
a=0;//     #v3=(One);
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 529
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 531
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "msg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 533
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 534
a=0;//     sget-object v1, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 535
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     .line 542
a=0;//     :goto_0
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 558
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 538
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/widget/Toast;);v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Toast;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 539
a=0;//     sget-object v1, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 540
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
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
a=0;//     .line 554
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 556
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 543
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Reference,Ljava/lang/String;);
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     .line 544
a=0;//     :try_start_1
a=0;//     sget-object v1, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 545
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     .line 552
a=0;//     :goto_2
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 548
a=0;//     :cond_3
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     sget-object v1, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     sget-object v2, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/Toast;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 549
a=0;//     sget-object v1, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 550
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;
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
a=0;// .method private d()V
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
a=0;//     .line 311
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 313
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/open/TDialog$FbWebViewClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/TDialog$FbWebViewClient;);
a=0;//     invoke-direct {v1, p0, v5}, Lcom/tencent/open/TDialog$FbWebViewClient;-><init>(Lcom/tencent/open/TDialog;Lcom/tencent/open/TDialog$1;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TDialog$FbWebViewClient;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->mChromeClient:Landroid/webkit/WebChromeClient;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 319
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
a=0;// 
a=0;//     .line 322
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 325
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V
a=0;// 
a=0;//     .line 326
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
a=0;// 
a=0;//     .line 327
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
a=0;// 
a=0;//     .line 329
a=0;//     sget-object v0, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings$RenderPriority;);
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V
a=0;// 
a=0;//     .line 330
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 332
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 333
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V
a=0;// 
a=0;//     .line 334
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;
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
a=0;//     .line 337
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->jsBridge:Lcom/tencent/open/a;
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/open/TDialog$JsListener;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/TDialog$JsListener;);
a=0;//     invoke-direct {v1, p0, v5}, Lcom/tencent/open/TDialog$JsListener;-><init>(Lcom/tencent/open/TDialog;Lcom/tencent/open/TDialog$1;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TDialog$JsListener;);
a=0;//     const-string v2, "sdk_js_if"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/open/a;->a(Lcom/tencent/open/a$b;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 366
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 367
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/open/TDialog;->a:Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 368
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
a=0;// 
a=0;//     .line 369
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
a=0;// 
a=0;//     .line 370
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static d(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 596
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 565
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 566
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "action"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 567
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "msg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 568
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v1, v0, :cond_3
a=0;// 
a=0;//     .line 569
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 570
a=0;//     new-instance v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 571
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 572
a=0;//     new-instance v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     sput-object v1, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 574
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 592
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 594
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 576
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 577
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 578
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 581
a=0;//     :cond_3
a=0;//     #v0=(One);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 582
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 585
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 587
a=0;//     sget-object v0, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 588
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/open/TDialog;->e:Ljava/lang/ref/WeakReference;
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBackPressed()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->g:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TDialog$OnTimeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->g:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/TDialog$OnTimeListener;->onCancel()V
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Lcom/tencent/open/b;->onBackPressed()V
a=0;// 
a=0;//     .line 229
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onConsoleMessage(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     const-string v0, "TDialog"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "--onConsoleMessage--"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 275
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog;->jsBridge:Lcom/tencent/open/a;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog;->j:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/tencent/open/a;->a(Landroid/webkit/WebView;Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 279
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 276
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     invoke-super {p0, p1}, Lcom/tencent/open/b;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 215
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/TDialog;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 219
a=0;//     invoke-direct {p0}, Lcom/tencent/open/TDialog;->c()V
a=0;// 
a=0;//     .line 220
a=0;//     invoke-direct {p0}, Lcom/tencent/open/TDialog;->d()V
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// .end method
}}
