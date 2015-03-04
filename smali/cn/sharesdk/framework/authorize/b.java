package cn.sharesdk.framework.authorize; class b { void a() { int a;
a=0;// .class public abstract Lcn/sharesdk/framework/authorize/b;
a=0;// .super Lcn/sharesdk/framework/m;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;// .field protected b:Ljava/lang/String;
a=0;// 
a=0;// .field protected c:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcn/sharesdk/framework/authorize/g;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/m;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/authorize/b;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/authorize/b;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/authorize/g;->a()Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeHelper;);
a=0;//     invoke-interface {v0}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getRedirectUri()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcn/sharesdk/framework/authorize/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getAuthorizeListener()Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/authorize/b;->c:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "AuthClient"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/b;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/g;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/g;->a()Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getAuthorizeListener()Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/b;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/g;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/authorize/g;->finish()V
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " ("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "): "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->proceed()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
