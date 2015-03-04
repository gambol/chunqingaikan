package cn.sharesdk.wechat.utils; class i { void a() { int a;
a=0;// .class Lcn/sharesdk/wechat/utils/i;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;// .field final synthetic b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/sharesdk/wechat/utils/g;Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/sharesdk/wechat/utils/i;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/i;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 12
a=0;// 
a=0;//     const/16 v11, 0x8
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "access_token"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v3}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/PlatformDb;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/e;);
a=0;//     const-string v2, "openid"
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "openid"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Lcn/sharesdk/framework/PlatformDb;->get(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v0, v2, v3}, Lcn/sharesdk/framework/network/e;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v2, "https://api.weixin.qq.com/sns/userinfo"
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/sharesdk/wechat/utils/g;->c(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/network/j;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "/sns/userinfo"
a=0;// 
a=0;//     iget-object v5, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v5=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v5}, Lcn/sharesdk/wechat/utils/g;->b(Lcn/sharesdk/wechat/utils/g;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v2, v1, v4, v5}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/i;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/i;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v0, v1, v11, v2}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Reference,Ljava/util/ArrayList;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "getUserInfo ==>>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v0, "errcode"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v0, "errcode"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/i;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/i;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v3, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v1, v2, v11, v3}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "openid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "nickname"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "sex"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const-string v4, "province"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "city"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "country"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "headimgurl"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "unionid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v9, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v9=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v9}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "nickname"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10, v2}, Lcn/sharesdk/framework/PlatformDb;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v3, v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "gender"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "0"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v9}, Lcn/sharesdk/framework/PlatformDb;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_2
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v8}, Lcn/sharesdk/framework/PlatformDb;->putUserId(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "icon"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v7}, Lcn/sharesdk/framework/PlatformDb;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "province"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Lcn/sharesdk/framework/PlatformDb;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "city"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v5}, Lcn/sharesdk/framework/PlatformDb;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "country"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v6}, Lcn/sharesdk/framework/PlatformDb;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "openid"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Lcn/sharesdk/framework/PlatformDb;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/i;->a:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v2, v11, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(One);v3=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v3, v2, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "gender"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "1"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v9}, Lcn/sharesdk/framework/PlatformDb;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(PosByte);v3=(Integer);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/i;->b:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     invoke-static {v2}, Lcn/sharesdk/wechat/utils/g;->a(Lcn/sharesdk/wechat/utils/g;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "gender"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "2"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v9}, Lcn/sharesdk/framework/PlatformDb;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
