package com.twocloo.com.cn.wxapi; class WXEntryActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/wxapi/WXEntryActivity;
a=0;// .super Lcn/sharesdk/wechat/utils/WechatHandlerActivity;
a=0;// .source "WXEntryActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/wxapi/WXEntryActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "arg0"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-super {p0, p1}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 52
a=0;//     const-string v0, "wx2819d944f57342c2"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Lcom/tencent/mm/sdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/wxapi/WXEntryActivity;->api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/wxapi/WXEntryActivity;->api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/wxapi/WXEntryActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-interface {v0, v1, p0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;)Z
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onGetMessageFromWXReq(Lcn/sharesdk/wechat/utils/WXMediaMessage;)V
a=0;//     .locals 3
a=0;//     .param p1, "msg"    # Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/wxapi/WXEntryActivity;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/wxapi/WXEntryActivity;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "iLaunchMyself":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/wxapi/WXEntryActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     invoke-super {p0, p1}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/wxapi/WXEntryActivity;->setIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/wxapi/WXEntryActivity;->api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     invoke-interface {v0, p1, p0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;)Z
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onReq(Lcom/tencent/mm/sdk/modelbase/BaseReq;)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # Lcom/tencent/mm/sdk/modelbase/BaseReq;
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResp(Lcom/tencent/mm/sdk/modelbase/BaseResp;)V
a=0;//     .locals 3
a=0;//     .param p1, "resp"    # Lcom/tencent/mm/sdk/modelbase/BaseResp;
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 114
a=0;//     .local v0, "result":I
a=0;//     #v0=(Null);
a=0;//     iget v1, p1, Lcom/tencent/mm/sdk/modelbase/BaseResp;->errCode:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 133
a=0;//     :pswitch_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$string;->errcode_unknown:I
a=0;// 
a=0;//     .line 137
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 138
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/wxapi/WXEntryActivity;->finish()V
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// 
a=0;//     .line 116
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);
a=0;//     sget-boolean v1, Lcom/twocloo/com/cn/common/Constants;->isWechatShare:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     sget v0, Lcom/twocloo/com/cn/R$string;->errcode_success:I
a=0;// 
a=0;//     .line 119
a=0;//     #v0=(Integer);
a=0;//     sget-boolean v1, Lcom/twocloo/com/cn/common/Constants;->isShareTimeline:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v1, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/ShareToSNS;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, p0, v2}, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;-><init>(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-array v2, v2, [Ljava/lang/Void;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/task/PresentShuquanByShareCountTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     sget v0, Lcom/twocloo/com/cn/R$string;->errcode_auth_success:I
a=0;// 
a=0;//     .line 125
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     :pswitch_2
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     sget v0, Lcom/twocloo/com/cn/R$string;->errcode_cancel:I
a=0;// 
a=0;//     .line 128
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :pswitch_3
a=0;//     #v0=(Null);
a=0;//     sget v0, Lcom/twocloo/com/cn/R$string;->errcode_deny:I
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x4
a=0;//         :pswitch_3
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onShowMessageFromWXReq(Lcn/sharesdk/wechat/utils/WXMediaMessage;)V
a=0;//     .locals 3
a=0;//     .param p1, "msg"    # Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v1, p1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     instance-of v1, v1, Lcn/sharesdk/wechat/utils/WXAppExtendObject;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;);
a=0;//     check-cast v0, Lcn/sharesdk/wechat/utils/WXAppExtendObject;
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "obj":Lcn/sharesdk/wechat/utils/WXAppExtendObject;
a=0;//     iget-object v1, v0, Lcn/sharesdk/wechat/utils/WXAppExtendObject;->extInfo:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 95
a=0;//     .end local v0    # "obj":Lcn/sharesdk/wechat/utils/WXAppExtendObject;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
