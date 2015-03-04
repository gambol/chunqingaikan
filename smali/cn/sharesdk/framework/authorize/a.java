package cn.sharesdk.framework.authorize; class a { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/authorize/a;
a=0;// .super Lcn/sharesdk/framework/FakeActivity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/FakeActivity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/authorize/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/a;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeHelper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/framework/authorize/AuthorizeHelper;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/authorize/a;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     invoke-interface {p1}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getPlatform()Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0, v0, v1}, Lcn/sharesdk/framework/FakeActivity;->show(Landroid/content/Context;Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "This method is deprecated, use show(AuthorizeHelper, Intent) instead"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v1
a=0;// .end method
}}
