package com.twocloo.com.cn.wxapi; class WXPayEntryActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/wxapi/WXPayEntryActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "WXPayEntryActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "MicroMsg.SDKSample.WXPayEntryActivity"
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
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/wxapi/WXPayEntryActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 33
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->pay_result:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/wxapi/WXPayEntryActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 35
a=0;//     const-string v0, "wx2819d944f57342c2"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/mm/sdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/wxapi/WXPayEntryActivity;->api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/wxapi/WXPayEntryActivity;->api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/wxapi/WXPayEntryActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-interface {v0, v1, p0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;)Z
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/wxapi/WXPayEntryActivity;->setIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/wxapi/WXPayEntryActivity;->api:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     invoke-interface {v0, p1, p0}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;)Z
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onReq(Lcom/tencent/mm/sdk/modelbase/BaseReq;)V
a=0;//     .locals 0
a=0;//     .param p1, "req"    # Lcom/tencent/mm/sdk/modelbase/BaseReq;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResp(Lcom/tencent/mm/sdk/modelbase/BaseResp;)V
a=0;//     .locals 4
a=0;//     .param p1, "resp"    # Lcom/tencent/mm/sdk/modelbase/BaseResp;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 52
a=0;//     #v3=(Null);
a=0;//     const-string v0, "MicroMsg.SDKSample.WXPayEntryActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "onPayFinish, errCode = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v2, p1, Lcom/tencent/mm/sdk/modelbase/BaseResp;->errCode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {p1}, Lcom/tencent/mm/sdk/modelbase/BaseResp;->getType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     iget v0, p1, Lcom/tencent/mm/sdk/modelbase/BaseResp;->errCode:I
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     const-string v0, "\u5145\u503c\u6210\u529f"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/wxapi/WXPayEntryActivity;->finish()V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// 
a=0;//     .line 57
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "\u5145\u503c\u5931\u8d25"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v3}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
