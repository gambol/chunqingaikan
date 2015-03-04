package cn.sharesdk.wechat.utils; class h { void a() { int a;
a=0;// .class Lcn/sharesdk/wechat/utils/h;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;// .field final synthetic c:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/sharesdk/wechat/utils/g;Ljava/lang/String;Lcn/sharesdk/framework/authorize/AuthorizeListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/h;->c:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/sharesdk/wechat/utils/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/sharesdk/wechat/utils/h;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "appid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/utils/h;->c:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v3}, Lcn/sharesdk/wechat/utils/g;->d(Lcn/sharesdk/wechat/utils/g;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "secret"
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/utils/h;->c:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/sharesdk/wechat/utils/g;->e(Lcn/sharesdk/wechat/utils/g;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "code"
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/utils/h;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "grant_type"
a=0;// 
a=0;//     const-string v3, "authorization_code"
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v1, "https://api.weixin.qq.com/sns/oauth2/access_token"
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/h;->c:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->c(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/network/j;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "/sns/oauth2/access_token"
a=0;// 
a=0;//     iget-object v4, p0, Lcn/sharesdk/wechat/utils/h;->c:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v4}, Lcn/sharesdk/wechat/utils/g;->b(Lcn/sharesdk/wechat/utils/g;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v1, v0, v3, v4}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/h;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Throwable;);
a=0;//     const-string v2, "Authorize token is empty"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0, v1}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onError(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/h;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onError(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v4=(Integer);
a=0;//     const-string v1, "errcode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/h;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/h;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v1, v2}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onError(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/h;->c:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v1, v0}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/h;->b:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onComplete(Landroid/os/Bundle;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
