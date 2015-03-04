package com.twocloo.com.cn.common; class JavaScript { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/common/JavaScript;
a=0;// .super Ljava/lang/Object;
a=0;// .source "JavaScript.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final NAME:Ljava/lang/String; = "twocloo"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private act:Landroid/app/Activity;
a=0;// 
a=0;// .field private app:Landroid/app/Application;
a=0;// 
a=0;// .field private callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field content:Ljava/lang/String;
a=0;// 
a=0;// .field private dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;// .field statusCode:Ljava/lang/String;
a=0;// 
a=0;// .field private task:Lcom/twocloo/base/sync/Task;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/twocloo/base/sync/Task",
a=0;//             "<****>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field tel:Ljava/lang/String;
a=0;// 
a=0;// .field type:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/app/Activity;Landroid/webkit/WebView;)V
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "mWebView"    # Landroid/webkit/WebView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/common/JavaScript$1;-><init>(Lcom/twocloo/com/cn/common/JavaScript;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 80
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 81
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/common/JavaScript;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/app/Activity;Landroid/webkit/WebView;Lcom/twocloo/base/sync/Task;)V
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "mWebView"    # Landroid/webkit/WebView;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Landroid/webkit/WebView;",
a=0;//             "Lcom/twocloo/base/sync/Task",
a=0;//             "<****>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     .local p3, "task":Lcom/twocloo/base/sync/Task;, "Lcom/twocloo/base/sync/Task<****>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/common/JavaScript$1;-><init>(Lcom/twocloo/com/cn/common/JavaScript;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 90
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 91
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/common/JavaScript;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 92
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/common/JavaScript;->task:Lcom/twocloo/base/sync/Task;
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/app/Activity;Landroid/webkit/WebView;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "mWebView"    # Landroid/webkit/WebView;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Landroid/webkit/WebView;",
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     .local p3, "callback":Lcom/twocloo/com/cn/singlebook/DataCallBack;, "Lcom/twocloo/com/cn/singlebook/DataCallBack<Lcom/twocloo/com/cn/beans/SubResultBean;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/common/JavaScript$1;-><init>(Lcom/twocloo/com/cn/common/JavaScript;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 110
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     .line 111
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/common/JavaScript;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 112
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/common/JavaScript;->callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/app/Application;Landroid/webkit/WebView;)V
a=0;//     .locals 1
a=0;//     .param p1, "app"    # Landroid/app/Application;
a=0;//     .param p2, "mWebView"    # Landroid/webkit/WebView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/common/JavaScript$1;-><init>(Lcom/twocloo/com/cn/common/JavaScript;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 85
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/JavaScript;->app:Landroid/app/Application;
a=0;// 
a=0;//     .line 86
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/common/JavaScript;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/app/Application;Landroid/webkit/WebView;Lcom/twocloo/base/sync/Task;)V
a=0;//     .locals 1
a=0;//     .param p1, "app"    # Landroid/app/Application;
a=0;//     .param p2, "mWebView"    # Landroid/webkit/WebView;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Application;",
a=0;//             "Landroid/webkit/WebView;",
a=0;//             "Lcom/twocloo/base/sync/Task",
a=0;//             "<****>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     .local p3, "task":Lcom/twocloo/base/sync/Task;, "Lcom/twocloo/base/sync/Task<****>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/common/JavaScript$1;-><init>(Lcom/twocloo/com/cn/common/JavaScript;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 104
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/JavaScript;->app:Landroid/app/Application;
a=0;// 
a=0;//     .line 105
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/common/JavaScript;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     .line 106
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/common/JavaScript;->task:Lcom/twocloo/base/sync/Task;
a=0;// 
a=0;//     .line 107
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/webkit/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/common/JavaScript;)Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/common/JavaScript;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newInstance(Landroid/app/Activity;Landroid/webkit/WebView;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "mWebView"    # Landroid/webkit/WebView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/twocloo/com/cn/common/JavaScript;-><init>(Landroid/app/Activity;Landroid/webkit/WebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newInstance(Landroid/app/Activity;Landroid/webkit/WebView;Lcom/twocloo/base/sync/Task;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "mWebView"    # Landroid/webkit/WebView;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Landroid/webkit/WebView;",
a=0;//             "Lcom/twocloo/base/sync/Task",
a=0;//             "<****>;)",
a=0;//             "Lcom/twocloo/com/cn/common/JavaScript;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     .local p2, "task":Lcom/twocloo/base/sync/Task;, "Lcom/twocloo/base/sync/Task<****>;"
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/twocloo/com/cn/common/JavaScript;-><init>(Landroid/app/Activity;Landroid/webkit/WebView;Lcom/twocloo/base/sync/Task;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newInstance(Landroid/app/Activity;Landroid/webkit/WebView;Lcom/twocloo/com/cn/singlebook/DataCallBack;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "mWebView"    # Landroid/webkit/WebView;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Landroid/webkit/WebView;",
a=0;//             "Lcom/twocloo/com/cn/singlebook/DataCallBack",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/SubResultBean;",
a=0;//             ">;)",
a=0;//             "Lcom/twocloo/com/cn/common/JavaScript;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     .local p2, "callback":Lcom/twocloo/com/cn/singlebook/DataCallBack;, "Lcom/twocloo/com/cn/singlebook/DataCallBack<Lcom/twocloo/com/cn/beans/SubResultBean;>;"
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/twocloo/com/cn/common/JavaScript;-><init>(Landroid/app/Activity;Landroid/webkit/WebView;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newInstance(Landroid/app/Application;Landroid/webkit/WebView;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;//     .locals 1
a=0;//     .param p0, "app"    # Landroid/app/Application;
a=0;//     .param p1, "mWebView"    # Landroid/webkit/WebView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/twocloo/com/cn/common/JavaScript;-><init>(Landroid/app/Application;Landroid/webkit/WebView;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newInstance(Landroid/app/Application;Landroid/webkit/WebView;Lcom/twocloo/base/sync/Task;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;//     .locals 1
a=0;//     .param p0, "app"    # Landroid/app/Application;
a=0;//     .param p1, "mWebView"    # Landroid/webkit/WebView;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Application;",
a=0;//             "Landroid/webkit/WebView;",
a=0;//             "Lcom/twocloo/base/sync/Task",
a=0;//             "<****>;)",
a=0;//             "Lcom/twocloo/com/cn/common/JavaScript;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     .local p2, "task":Lcom/twocloo/base/sync/Task;, "Lcom/twocloo/base/sync/Task<****>;"
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/twocloo/com/cn/common/JavaScript;-><init>(Landroid/app/Application;Landroid/webkit/WebView;Lcom/twocloo/base/sync/Task;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/JavaScript;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private sendMsg(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "smsSendTo"    # Ljava/lang/String;
a=0;//     .param p2, "smsContent"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "smsto:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 257
a=0;//     .local v2, "uri":Landroid/net/Uri;
a=0;//     #v2=(Reference,Landroid/net/Uri;);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.action.SENDTO"
a=0;// 
a=0;//     invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 259
a=0;//     .local v0, "i":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$string;->sms_body_name:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 260
a=0;//     .local v1, "smsBodyName":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 263
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static sendMsg(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 15
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "receiver"    # Ljava/lang/String;
a=0;//     .param p2, "content"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     const-string v2, "phone"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v14, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 276
a=0;//     .local v14, "tm":Landroid/telephony/TelephonyManager;
a=0;//     invoke-virtual {v14}, Landroid/telephony/TelephonyManager;->getSimState()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 277
a=0;//     .local v13, "telstate":I
a=0;//     #v13=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-eq v13, v2, :cond_0
a=0;// 
a=0;//     if-nez v13, :cond_1
a=0;// 
a=0;//     .line 278
a=0;//     :cond_0
a=0;//     const-string v2, "\u60a8\u6ca1\u6709\u624b\u673a\u5361"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 295
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(PosByte);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 280
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u77ed\u4fe1\u5185\u5bb9|"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 281
a=0;//     invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 282
a=0;//     .local v1, "smsManager":Landroid/telephony/SmsManager;
a=0;//     #v1=(Reference,Landroid/telephony/SmsManager;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v3}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {p0, v2, v3, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 284
a=0;//     .local v5, "sentIntent":Landroid/app/PendingIntent;
a=0;//     #v5=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x46
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-le v2, v3, :cond_3
a=0;// 
a=0;//     .line 285
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/telephony/SmsManager;->divideMessage(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 286
a=0;//     .local v12, "msgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v7=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 292
a=0;//     .end local v12    # "msgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     :goto_2
a=0;//     #v2=(Integer);v6=(Reference,Landroid/telephony/SmsManager;);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 286
a=0;//     .restart local v12    # "msgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v6=(Null);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     .line 287
a=0;//     .local v4, "msg":Ljava/lang/String;
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     move-object/from16 v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v1 .. v6}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 290
a=0;//     .end local v4    # "msg":Ljava/lang/String;
a=0;//     .end local v12    # "msgs":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(PosByte);v4=(Uninit);v7=(Uninit);v12=(Uninit);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     move-object v6, v1
a=0;// 
a=0;//     #v6=(Reference,Landroid/telephony/SmsManager;);
a=0;//     move-object/from16 v7, p1
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v9, p2
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object v10, v5
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual/range {v6 .. v11}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addBookrack(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "aId"    # Ljava/lang/String;
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;//     .param p3, "url"    # Ljava/lang/String;
a=0;//     .param p4, "finish"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 418
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, p1, p2, p3, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->addBookAndDown(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 419
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBookrack(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "aId"    # Ljava/lang/String;
a=0;//     .param p2, "name"    # Ljava/lang/String;
a=0;//     .param p3, "url"    # Ljava/lang/String;
a=0;//     .param p4, "finish"    # Ljava/lang/String;
a=0;//     .param p5, "isFromFence"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 423
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->addBookAndDown(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 424
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public changeEmai()V
a=0;//     .locals 0
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 456
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public changePassword()V
a=0;//     .locals 3
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 449
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 450
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 478
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeWindow(I)V
a=0;//     .locals 1
a=0;//     .param p1, "a"    # I
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 523
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goBack()V
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 391
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 392
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goBookCity()V
a=0;//     .locals 3
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 171
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_bookcity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goBookrack()V
a=0;//     .locals 3
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 163
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goBuyMonth(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 9
a=0;//     .param p1, "type"    # Ljava/lang/String;
a=0;//     .param p2, "status"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 615
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v8, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/String;);
a=0;//     const-string v0, "\u9a6c\u4e0a\u5305\u6708\uff0c\u81ea\u7531\u7545\u8bfb"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v8, v4
a=0;// 
a=0;//     const-string v0, "\u5ef6\u957f\u5305\u6708\u65f6\u95f4\uff0c\u81ea\u7531\u7545\u8bfb"
a=0;// 
a=0;//     aput-object v0, v8, v3
a=0;// 
a=0;//     .line 616
a=0;//     .local v8, "baoyueArry":[Ljava/lang/String;
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 617
a=0;//     .local v2, "baoyue":Ljava/lang/String;
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 618
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 619
a=0;//     aget-object v2, v8, v3
a=0;// 
a=0;//     .line 623
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u53d6\u6d88"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/common/JavaScript$3;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$3;);
a=0;//     invoke-direct {v6, p0, p1}, Lcom/twocloo/com/cn/common/JavaScript$3;-><init>(Lcom/twocloo/com/cn/common/JavaScript;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 631
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/common/JavaScript$3;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/common/JavaScript$4;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$4;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/common/JavaScript$4;-><init>(Lcom/twocloo/com/cn/common/JavaScript;)V
a=0;// 
a=0;//     .line 623
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/common/JavaScript$4;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 643
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 621
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     aget-object v2, v8, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 640
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, "LOGINTAG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public goDownload(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 411
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/http/RecommendClientsService;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 412
a=0;//     .local v0, "in":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 414
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goExchange(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p1, "type"    # Ljava/lang/String;
a=0;//     .param p2, "id"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 681
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 682
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 683
a=0;//     .local v3, "uid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v4, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 684
a=0;//     .local v2, "token":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 685
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants;->HUODONG_JIANLI_URL1:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "&userid="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "&token="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 686
a=0;//     .local v0, "Url":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/Thread;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v5, Lcom/twocloo/com/cn/common/JavaScript$5;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$5;);
a=0;//     invoke-direct {v5, p0, v0}, Lcom/twocloo/com/cn/common/JavaScript$5;-><init>(Lcom/twocloo/com/cn/common/JavaScript;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/common/JavaScript$5;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 702
a=0;//     #v4=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 742
a=0;//     .end local v0    # "Url":Ljava/lang/String;
a=0;//     .end local v2    # "token":Ljava/lang/String;
a=0;//     .end local v3    # "uid":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 704
a=0;//     .restart local v2    # "token":Ljava/lang/String;
a=0;//     .restart local v3    # "uid":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Boolean);v5=(Null);v6=(PosByte);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 705
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 706
a=0;//     .local v1, "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput v4, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 707
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v4, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 709
a=0;//     .end local v1    # "msg":Landroid/os/Message;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v4=(Boolean);
a=0;//     const-string v4, "[0-9]+"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 710
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 711
a=0;//     .restart local v1    # "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iput v4, v1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 712
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v4, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 715
a=0;//     .end local v1    # "msg":Landroid/os/Message;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v4=(Boolean);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants;->HUODONG_JIANLI_URL2:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "&bid="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "&token="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 717
a=0;//     .restart local v0    # "Url":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/Thread;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v5, Lcom/twocloo/com/cn/common/JavaScript$6;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$6;);
a=0;//     invoke-direct {v5, p0, v0}, Lcom/twocloo/com/cn/common/JavaScript$6;-><init>(Lcom/twocloo/com/cn/common/JavaScript;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/common/JavaScript$6;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 734
a=0;//     #v4=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 739
a=0;//     .end local v0    # "Url":Ljava/lang/String;
a=0;//     .end local v2    # "token":Ljava/lang/String;
a=0;//     .end local v3    # "uid":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Conflicted);v5=(Conflicted);v6=(Uninit);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     const-string v5, "LOGINTAG"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public goInvite(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "string"    # Ljava/lang/String;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation build Landroid/annotation/TargetApi;
a=0;//         value = 0xb
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 657
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 658
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "2015\u66f4\u4e0a\u5c42\u697c\u5f81\u6587\u5927\u8d5b\uff0c\u5355\u672c\u4f5c\u54c1\u4fdd\u5e9510\u4e07\u5143\uff0c\u66f4\u6709\u4e0a\u767e\u4efdC\u7ea7\u7b7e\u7ea6\u7b49\u4f60\u6765\u62ff\uff0c\u5feb\u6765\u53c2\u8d5b\u5427\uff01\u6d3b\u52a8\u7f51\u5740:"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 659
a=0;//     .local v1, "share":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-le v2, v3, :cond_0
a=0;// 
a=0;//     .line 660
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     const-string v3, "clipboard"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/ClipboardManager;
a=0;// 
a=0;//     .line 661
a=0;//     .local v0, "cmb":Landroid/content/ClipboardManager;
a=0;//     const-string v2, ""
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "&username="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUsername()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "&userid="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 662
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 661
a=0;//     invoke-static {v2, v3}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
a=0;// 
a=0;//     .line 667
a=0;//     .end local v0    # "cmb":Landroid/content/ClipboardManager;
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->shareString(Ljava/lang/String;Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 671
a=0;//     .end local v1    # "share":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 664
a=0;//     .restart local v1    # "share":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Ljava/lang/String;);v2=(Integer);v3=(PosByte);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     const-string v3, "clipboard"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/text/ClipboardManager;
a=0;// 
a=0;//     .line 665
a=0;//     .local v0, "cmb":Landroid/text/ClipboardManager;
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "&username="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUsername()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "&userid="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 669
a=0;//     .end local v0    # "cmb":Landroid/text/ClipboardManager;
a=0;//     .end local v1    # "share":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     const-string v3, "LOGINTAG"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public goLogin()V
a=0;//     .locals 2
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 396
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 397
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goLogout()V
a=0;//     .locals 4
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 434
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 435
a=0;//     .local v0, "apptype":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "single"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 436
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/LoginActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 437
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 444
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 439
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Boolean);v3=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->logout(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 440
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 441
a=0;//     .restart local v1    # "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "id"
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$id;->main_usercenter:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 442
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public goPartlist(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "aId"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 487
a=0;//     #v7=(Null);
a=0;//     sget-object v4, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 488
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 513
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 490
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v6=(One);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 491
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     const-string v5, "\u5bf9\u4e0d\u8d77\uff0c\u8be5\u4e66\u5df2\u7ecf\u4e0d\u5b58\u5728\uff01"
a=0;// 
a=0;//     invoke-static {v4, v5, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 493
a=0;//     :cond_1
a=0;//     #v4=(Boolean);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     const-string v5, "\u6570\u636e\u52a0\u8f7d\u4e2d\uff0c\u8bf7\u7a0d\u540e\u3002"
a=0;// 
a=0;//     invoke-static {v4, v5}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 495
a=0;//     .local v1, "dialog":Landroid/app/ProgressDialog;
a=0;//     #v1=(Reference,Landroid/app/ProgressDialog;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v4, p1, v5}, Lcom/twocloo/com/cn/http/HttpImpl;->Shubenxinxiye(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 496
a=0;//     .local v3, "sbxxy":Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/Shubenxinxiye;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 497
a=0;//     sput-boolean v6, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;->isFromCityOrReadpage:Z
a=0;// 
a=0;//     .line 498
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     const-class v5, Lcom/twocloo/com/cn/activitys/NovelDetailedActivity;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 499
a=0;//     .local v2, "intent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 500
a=0;//     .local v0, "bundle":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v4, "Articleid"
a=0;// 
a=0;//     invoke-virtual {v0, v4, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 501
a=0;//     const-string v4, "flag"
a=0;// 
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 502
a=0;//     const-string v4, "newbook"
a=0;// 
a=0;//     invoke-virtual {v2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 503
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 504
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     instance-of v4, v4, Lcom/twocloo/com/cn/activitys/LastPageGuide;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 505
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v4}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 511
a=0;//     .end local v0    # "bundle":Landroid/os/Bundle;
a=0;//     .end local v2    # "intent":Landroid/content/Intent;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 509
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Uninit);v4=(Reference,Landroid/app/Activity;);v5=(Null);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     const-string v5, "\u83b7\u53d6\u4fe1\u606f\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5\uff01"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public goPay()V
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToConsume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 304
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goPay(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "way"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     .line 314
a=0;//     const-string v1, "goOffer"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 317
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 318
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 340
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 363
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 319
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "alipay"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 320
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/RechargeAlipayActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 321
a=0;//     .restart local v0    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "latestchannel"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 323
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "ydmm"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 324
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/RechargeSMSCMActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 325
a=0;//     .restart local v0    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "latestchannel"
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 326
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 327
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "liantong"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 328
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/RechargeSMSCUActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 329
a=0;//     .restart local v0    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "latestchannel"
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 331
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "dianxin"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 332
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/RechargeSMSCTActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 333
a=0;//     .restart local v0    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "latestchannel"
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 335
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "weixin"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 336
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/RechargeWechatpayActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 337
a=0;//     .restart local v0    # "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "latestchannel"
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 338
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 342
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-string v2, "LOGINTAG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public goPayCustom(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "way"    # Ljava/lang/String;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "textid"    # Ljava/lang/String;
a=0;//     .param p4, "title"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 375
a=0;//     const-string v1, "2yuan"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 376
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 377
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 378
a=0;//     const-string v1, "textid"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 379
a=0;//     const-string v1, "aid"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 380
a=0;//     const/high16 v1, 0x4000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 381
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 382
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 384
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goPersonCenter()V
a=0;//     .locals 3
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 155
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_usercenter:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goReading(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 460
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/GeneralActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 461
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 462
a=0;//     const-string v1, "from"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 463
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 464
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goReading(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/GeneralActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 469
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 470
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 471
a=0;//     const-string v1, "from"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 472
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 473
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goRecommend()V
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 406
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToApp(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 407
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goReg()V
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToRegist(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 402
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goSub(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "textid"    # Ljava/lang/String;
a=0;//     .param p4, "count"    # I
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 561
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/VipChapterSubTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/VipChapterSubTask;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/JavaScript;->callback:Lcom/twocloo/com/cn/singlebook/DataCallBack;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/singlebook/DataCallBack;);
a=0;//     invoke-direct {v0, v1, p1, v2}, Lcom/twocloo/com/cn/task/VipChapterSubTask;-><init>(Landroid/app/Activity;Ljava/lang/String;Lcom/twocloo/com/cn/singlebook/DataCallBack;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/VipChapterSubTask;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/VipChapterSubTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 562
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goToActive(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 752
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/GeneralActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 753
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 754
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 755
a=0;//     const-string v1, "from"
a=0;// 
a=0;//     const-string v2, "active"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 756
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 758
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goToCenter()V
a=0;//     .locals 3
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 765
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 766
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_usercenter:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 767
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 768
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/Activity;->finish()V
a=0;// 
a=0;//     .line 769
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public goUsercp()V
a=0;//     .locals 0
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public order(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "smsContent"    # Ljava/lang/String;
a=0;//     .param p2, "smsSendTo"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     #v4=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v1, p2, p1}, Lcom/twocloo/com/cn/common/JavaScript;->sendMsg(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 241
a=0;//     .local v0, "success":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     const-string v2, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "\u77ed\u4fe1\u53d1\u9001\u5b8c\u6210"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3, v4}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     .line 246
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 244
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     const-string v2, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "\u77ed\u4fe1\u53d1\u9001\u5931\u8d25"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3, v4}, Lcom/twocloo/base/util/ViewUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public pageBaseInfo(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "type"    # Ljava/lang/String;
a=0;//     .param p2, "itemType"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 535
a=0;//     const-string v0, "rec"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 536
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->hasExit:Z
a=0;// 
a=0;//     .line 540
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 538
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/fragment/BookCityFragment;->hasExit:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public preOrder(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "phoneNo"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/common/JavaScript$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/common/JavaScript$2;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/twocloo/com/cn/common/JavaScript$2;-><init>(Lcom/twocloo/com/cn/common/JavaScript;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/JavaScript$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 218
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public reOrder()V
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->mWebView:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V
a=0;// 
a=0;//     .line 226
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAutosub(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "aid"    # Ljava/lang/String;
a=0;//     .param p3, "flag"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 551
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/GetAutoOrderThread;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v0, v1, p2, v2}, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;-><init>(Landroid/app/Activity;Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/GetAutoOrderThread;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/GetAutoOrderThread;->start()V
a=0;// 
a=0;//     .line 552
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setChannel(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "cityType"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 530
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v0, p1}, Lcom/twocloo/com/cn/common/LocalStore;->setBookCityType(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 531
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public standOut(Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "result"    # Ljava/lang/String;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 581
a=0;//     :try_start_0
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 582
a=0;//     .local v2, "ja":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "statusCode"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 583
a=0;//     const-string v4, "statusCode"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->statusCode:Ljava/lang/String;
a=0;// 
a=0;//     .line 584
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "type"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 585
a=0;//     const-string v4, "type"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->type:Ljava/lang/String;
a=0;// 
a=0;//     .line 586
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "content"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 587
a=0;//     const-string v4, "content"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->content:Ljava/lang/String;
a=0;// 
a=0;//     .line 588
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "to_number"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 589
a=0;//     const-string v4, "to_number"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->tel:Ljava/lang/String;
a=0;// 
a=0;//     .line 591
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->statusCode:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 592
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->type:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 593
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "smsto:"
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/JavaScript;->tel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 594
a=0;//     .local v3, "uri":Landroid/net/Uri;
a=0;//     #v3=(Reference,Landroid/net/Uri;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v4, "android.intent.action.SENDTO"
a=0;// 
a=0;//     invoke-direct {v1, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
a=0;// 
a=0;//     .line 595
a=0;//     .local v1, "i":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "sms_body"
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/JavaScript;->content:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 596
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/JavaScript;->act:Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 603
a=0;//     .end local v1    # "i":Landroid/content/Intent;
a=0;//     .end local v2    # "ja":Lorg/json/JSONObject;
a=0;//     .end local v3    # "uri":Landroid/net/Uri;
a=0;//     :cond_4
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 599
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 600
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
