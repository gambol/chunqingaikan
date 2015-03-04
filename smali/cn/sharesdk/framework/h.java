package cn.sharesdk.framework; class h { void a() { int a;
a=0;// .class public abstract Lcn/sharesdk/framework/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;// .field private b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;// .field private c:Lcn/sharesdk/framework/authorize/SSOListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcn/sharesdk/framework/Platform;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/h;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/h;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Lcn/sharesdk/framework/authorize/SSOListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/h;->c:Lcn/sharesdk/framework/authorize/SSOListener;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/authorize/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/authorize/e;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/authorize/e;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/e;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/authorize/e;->a(Lcn/sharesdk/framework/authorize/SSOListener;)V
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcn/sharesdk/framework/authorize/e;->a(Lcn/sharesdk/framework/authorize/AuthorizeHelper;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b(Lcn/sharesdk/framework/authorize/AuthorizeListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/h;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/authorize/g;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/authorize/g;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/g;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/h;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeListener;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/authorize/g;->a(Lcn/sharesdk/framework/authorize/AuthorizeListener;)V
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcn/sharesdk/framework/authorize/g;->a(Lcn/sharesdk/framework/authorize/AuthorizeHelper;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/h;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->getPlatformId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getAuthorizeListener()Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/h;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPlatform()Lcn/sharesdk/framework/Platform;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/h;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSSOListener()Lcn/sharesdk/framework/authorize/SSOListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/h;->c:Lcn/sharesdk/framework/authorize/SSOListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/SSOListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSSOProcessor(Lcn/sharesdk/framework/authorize/e;)Lcn/sharesdk/framework/authorize/f;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
}}
