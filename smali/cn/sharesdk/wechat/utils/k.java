package cn.sharesdk.wechat.utils; class k { void a() { int a;
a=0;// .class public Lcn/sharesdk/wechat/utils/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;// .field private b:Lcn/sharesdk/framework/Platform$ShareParams;
a=0;// 
a=0;// .field private c:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;// .field private d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;// .field private e:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcn/sharesdk/framework/Platform;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/k;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Lcn/sharesdk/framework/Platform$ShareParams;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->b:Lcn/sharesdk/framework/Platform$ShareParams;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform$ShareParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/framework/PlatformActionListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/k;->b:Lcn/sharesdk/framework/Platform$ShareParams;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/sharesdk/wechat/utils/k;->c:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/framework/authorize/AuthorizeListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/k;->d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/wechat/utils/WechatResp;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iget v0, p1, Lcn/sharesdk/wechat/utils/WechatResp;->f:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "req"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "errCode"
a=0;// 
a=0;//     iget v2, p1, Lcn/sharesdk/wechat/utils/WechatResp;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "errStr"
a=0;// 
a=0;//     iget-object v2, p1, Lcn/sharesdk/wechat/utils/WechatResp;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "transaction"
a=0;// 
a=0;//     iget-object v2, p1, Lcn/sharesdk/wechat/utils/WechatResp;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Throwable;);
a=0;//     new-instance v2, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v2}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v2, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/wechat/utils/WechatResp;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Lcn/sharesdk/wechat/utils/WechatResp;->b(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/k;->e:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/g;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/k;->d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeListener;);
a=0;//     invoke-virtual {v1, v0, v2}, Lcn/sharesdk/wechat/utils/g;->a(Landroid/os/Bundle;Lcn/sharesdk/framework/authorize/AuthorizeListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->c:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "ShareParams"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/k;->b:Lcn/sharesdk/framework/Platform$ShareParams;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform$ShareParams;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/k;->c:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/k;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     invoke-interface {v1, v2, v3, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/wechat/utils/WechatResp;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     packed-switch v0, :pswitch_data_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     invoke-interface {v0}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onCancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->c:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->c:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/k;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-interface {v0, v1, v3}, Lcn/sharesdk/framework/PlatformActionListener;->onCancel(Lcn/sharesdk/framework/Platform;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_7
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "errCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p1, Lcn/sharesdk/wechat/utils/WechatResp;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "errStr"
a=0;// 
a=0;//     iget-object v2, p1, Lcn/sharesdk/wechat/utils/WechatResp;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "transaction"
a=0;// 
a=0;//     iget-object v2, p1, Lcn/sharesdk/wechat/utils/WechatResp;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Throwable;);
a=0;//     new-instance v2, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v2}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v2, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/wechat/utils/WechatResp;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_3
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_8
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onError(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_9
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->c:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->c:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/wechat/utils/k;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     invoke-interface {v0, v2, v3, v1}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_a
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "errCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p1, Lcn/sharesdk/wechat/utils/WechatResp;->f:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "errStr"
a=0;// 
a=0;//     iget-object v2, p1, Lcn/sharesdk/wechat/utils/WechatResp;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "transaction"
a=0;// 
a=0;//     iget-object v2, p1, Lcn/sharesdk/wechat/utils/WechatResp;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Throwable;);
a=0;//     new-instance v2, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v2}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v2, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/wechat/utils/WechatResp;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_4
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_b
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/authorize/AuthorizeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->d:Lcn/sharesdk/framework/authorize/AuthorizeListener;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onError(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x4
a=0;//         :pswitch_a
a=0;//         :pswitch_7
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// 
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// 
a=0;//     :pswitch_data_2
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// 
a=0;//     :pswitch_data_3
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//     .end packed-switch
a=0;// 
a=0;//     :pswitch_data_4
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_b
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/wechat/utils/g;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/k;->e:Lcn/sharesdk/wechat/utils/g;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()Lcn/sharesdk/framework/Platform;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->a:Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c()Lcn/sharesdk/framework/PlatformActionListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/k;->c:Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     return-object v0
a=0;// .end method
}}
