package cn.sharesdk.wechat.utils; class a { void a() { int a;
a=0;// .class public Lcn/sharesdk/wechat/utils/a;
a=0;// .super Lcn/sharesdk/wechat/utils/l;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Ljava/lang/String;
a=0;// 
a=0;// .field public b:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/wechat/utils/l;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcn/sharesdk/wechat/utils/l;->a(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_sendauth_req_scope"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_sendauth_req_state"
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v3, 0x400
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v2, v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "MicroMsg.SDK.SendAuth.Req"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "checkArgs fail, scope is invalid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v2=(Integer);v3=(PosShort);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-le v2, v3, :cond_2
a=0;// 
a=0;//     const-string v2, "MicroMsg.SDK.SendAuth.Req"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const-string v3, "checkArgs fail, state is invalid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v0
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(One);v2=(Conflicted);v3=(PosShort);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
