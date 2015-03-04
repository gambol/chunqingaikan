package cn.sharesdk.framework.authorize; class g { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/authorize/g;
a=0;// .super Lcn/sharesdk/framework/authorize/a;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Handler$Callback;
a=0;// .implements Lcn/sharesdk/framework/authorize/ResizeLayout$OnResizeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/sharesdk/framework/authorize/g$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;// .field private c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;// .field private d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;// .field private e:Landroid/webkit/WebView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/authorize/a;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/authorize/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/sharesdk/framework/authorize/g;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/sharesdk/framework/authorize/g;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c()Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/g;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v2}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v3, 0x80
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, v2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v3, "AuthorizeAdapter"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v0, v2, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v2, "Adapter"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     instance-of v2, v0, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public OnResize(IIII)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onResize(IIII)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/framework/authorize/AuthorizeListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/authorize/g;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b()Lcn/sharesdk/framework/authorize/RegisterView;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/authorize/RegisterView;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v0, v1}, Lcn/sharesdk/framework/authorize/RegisterView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/RegisterView;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/RegisterView;->a()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lcn/sharesdk/framework/authorize/h;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/authorize/h;);
a=0;//     invoke-direct {v2, p0}, Lcn/sharesdk/framework/authorize/h;-><init>(Lcn/sharesdk/framework/authorize/g;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/authorize/h;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/RegisterView;->b()Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcn/sharesdk/framework/authorize/g;->e:Landroid/webkit/WebView;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->e:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->e:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->e:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getAuthorizeWebviewClient(Lcn/sharesdk/framework/authorize/g;)Lcn/sharesdk/framework/authorize/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/g;->e:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/authorize/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/g;->e:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/authorize/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/authorize/j;);
a=0;//     invoke-direct {v1, p0}, Lcn/sharesdk/framework/authorize/j;-><init>(Lcn/sharesdk/framework/authorize/g;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/j;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/authorize/j;->start()V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public handleMessage(Landroid/os/Message;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget v0, p1, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeHelper;);
a=0;//     invoke-interface {v0}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getAuthorizeListener()Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Network error (platform: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     invoke-interface {v2}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getPlatform()Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ")"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v2, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0, v2}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onError(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/authorize/g;->finish()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     invoke-interface {v0}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getAuthorizeListener()Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Authorize URL is empty (platform: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     invoke-interface {v2}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getPlatform()Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ")"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v2, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0, v2}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onError(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->e:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v6, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/RegisterView;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/authorize/g;->b()Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/authorize/g;->d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcn/sharesdk/framework/authorize/RegisterView;->a(Lcn/sharesdk/framework/authorize/ResizeLayout$OnResizeListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->isNotitle()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v0, v3}, Lcn/sharesdk/framework/authorize/RegisterView;->a(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/authorize/g;->d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/authorize/RegisterView;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/authorize/RegisterView;->d()Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->setBodyView(Landroid/widget/RelativeLayout;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/authorize/g;->d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/authorize/RegisterView;->b()Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->setWebView(Landroid/webkit/WebView;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/RegisterView;->c()Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->setTitleView(Lcn/sharesdk/framework/TitleLayout;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     invoke-interface {v0}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getPlatform()Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     iget-object v7, p0, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     #v7=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeHelper;);
a=0;//     invoke-interface {v7}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getPlatform()Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->setPlatformName(Ljava/lang/String;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/authorize/g;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v0}, Lcn/sharesdk/framework/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/TitleLayout;->getTvTitle()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onCreate()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->isPopUpAnimationDisable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/view/animation/ScaleAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/ScaleAnimation;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v7, v5
a=0;// 
a=0;//     #v7=(One);
a=0;//     move v8, v6
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/ScaleAnimation;);
a=0;//     const-wide/16 v1, 0x226
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/authorize/g$a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/authorize/g$a;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, v2}, Lcn/sharesdk/framework/authorize/g$a;-><init>(Lcn/sharesdk/framework/authorize/h;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/g$a;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/authorize/RegisterView;->setAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->activity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->d:Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Reference,Lcn/sharesdk/framework/TitleLayout;);v4=(Reference,Ujava/lang/Object;);v7=(Reference,Ljava/lang/String;);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/authorize/g;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v7, "weibo_oauth_regiseter"
a=0;// 
a=0;//     invoke-static {v4, v7}, Lcn/sharesdk/framework/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/TitleLayout;->getTvTitle()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onDestroy()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onFinish()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onFinish()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     invoke-super {p0}, Lcn/sharesdk/framework/authorize/a;->onFinish()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyEvent(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onKeyEvent(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeHelper;);
a=0;//     invoke-interface {v1}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getAuthorizeListener()Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onCancel()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-super {p0, p1, p2}, Lcn/sharesdk/framework/authorize/a;->onKeyEvent(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onPause()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onRestart()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onRestart()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onResume()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onStart()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->onStop()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setActivity(Landroid/app/Activity;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcn/sharesdk/framework/authorize/a;->setActivity(Landroid/app/Activity;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/authorize/g;->c()Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeAdapter;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/g;->c:Lcn/sharesdk/framework/authorize/AuthorizeAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/authorize/AuthorizeAdapter;->setActivity(Landroid/app/Activity;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
