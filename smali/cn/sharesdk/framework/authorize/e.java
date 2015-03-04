package cn.sharesdk.framework.authorize; class e { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/authorize/e;
a=0;// .super Lcn/sharesdk/framework/authorize/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected b:Lcn/sharesdk/framework/authorize/SSOListener;
a=0;// 
a=0;// .field private c:Lcn/sharesdk/framework/authorize/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/authorize/a;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/authorize/e;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcn/sharesdk/framework/authorize/SSOListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/authorize/e;->b:Lcn/sharesdk/framework/authorize/SSOListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/e;->c:Lcn/sharesdk/framework/authorize/f;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/f;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lcn/sharesdk/framework/authorize/f;->a(IILandroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/e;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeHelper;);
a=0;//     invoke-interface {v0, p0}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getSSOProcessor(Lcn/sharesdk/framework/authorize/e;)Lcn/sharesdk/framework/authorize/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/authorize/e;->c:Lcn/sharesdk/framework/authorize/f;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/e;->c:Lcn/sharesdk/framework/authorize/f;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/authorize/e;->finish()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/e;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
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
a=0;//     const-string v2, "Failed to start SSO for "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/e;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
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
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/e;->c:Lcn/sharesdk/framework/authorize/f;
a=0;// 
a=0;//     const v1, 0x80cd
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/authorize/f;->a(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/e;->c:Lcn/sharesdk/framework/authorize/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/authorize/f;->a()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/e;->c:Lcn/sharesdk/framework/authorize/f;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/f;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/authorize/f;->a(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
