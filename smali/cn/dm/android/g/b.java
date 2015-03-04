package cn.dm.android.g; class b { void a() { int a;
a=0;// .class public Lcn/dm/android/g/b;
a=0;// .super Landroid/webkit/WebView;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcn/dm/android/f/e;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/android/g/b;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 25
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcn/dm/android/g/b;);
a=0;//     invoke-direct {p0}, Lcn/dm/android/g/b;->b()V
a=0;// 
a=0;//     .line 29
a=0;//     invoke-virtual {p0}, Lcn/dm/android/g/b;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 31
a=0;//     invoke-virtual {p0}, Lcn/dm/android/g/b;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 33
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 36
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v0}, Lcn/dm/android/g/b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Lcn/dm/android/f/e;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     sget-object v0, Lcn/dm/android/g/b;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Lcn/dm/android/g/b;->setHorizontalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p0, v1}, Lcn/dm/android/g/b;->setHorizontalScrollbarOverlay(Z)V
a=0;// 
a=0;//     .line 51
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcn/dm/android/g/b;->setVerticalScrollbarOverlay(Z)V
a=0;// 
a=0;//     .line 52
a=0;//     invoke-virtual {p0}, Lcn/dm/android/g/b;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings;);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 42
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v0}, Lcn/dm/android/g/b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Lcn/dm/android/g/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     new-instance v0, Lcn/dm/android/ui/interaction/Call4JavaScript;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/ui/interaction/Call4JavaScript;);
a=0;//     invoke-direct {v0, p0}, Lcn/dm/android/ui/interaction/Call4JavaScript;-><init>(Lcn/dm/android/g/b;)V
a=0;// 
a=0;//     .line 74
a=0;//     #v0=(Reference,Lcn/dm/android/ui/interaction/Call4JavaScript;);
a=0;//     invoke-virtual {v0, p2}, Lcn/dm/android/ui/interaction/Call4JavaScript;->setId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     const-string v1, "dom"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcn/dm/android/g/b;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p0, p1}, Lcn/dm/android/g/b;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v0, Lcn/dm/android/g/b$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/g/b$1;);
a=0;//     invoke-direct {v0, p0}, Lcn/dm/android/g/b$1;-><init>(Lcn/dm/android/g/b;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/g/b$1;);
a=0;//     invoke-virtual {p0, v0}, Lcn/dm/android/g/b;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v0, Lcn/dm/android/g/b$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/g/b$2;);
a=0;//     invoke-direct {v0, p0}, Lcn/dm/android/g/b$2;-><init>(Lcn/dm/android/g/b;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/g/b$2;);
a=0;//     invoke-virtual {p0, v0}, Lcn/dm/android/g/b;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized b(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 102
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
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 103
a=0;//     sget-object v0, Lcn/dm/android/g/b;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "executeJSFunction -> "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {p0}, Lcn/dm/android/g/b;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     new-instance v2, Lcn/dm/android/g/b$3;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/g/b$3;);
a=0;//     invoke-direct {v2, p0, v1}, Lcn/dm/android/g/b$3;-><init>(Lcn/dm/android/g/b;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/g/b$3;);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 101
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
