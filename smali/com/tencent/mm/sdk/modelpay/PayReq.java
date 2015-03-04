package com.tencent.mm.sdk.modelpay; class PayReq { void a() { int a;
a=0;// .class public Lcom/tencent/mm/sdk/modelpay/PayReq;
a=0;// .super Lcom/tencent/mm/sdk/modelbase/BaseReq;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/mm/sdk/modelpay/PayReq$Options;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final EXTDATA_MAX_LENGTH:I = 0x400
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "MicroMsg.PaySdk.PayReq"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public appId:Ljava/lang/String;
a=0;// 
a=0;// .field public extData:Ljava/lang/String;
a=0;// 
a=0;// .field public nonceStr:Ljava/lang/String;
a=0;// 
a=0;// .field public options:Lcom/tencent/mm/sdk/modelpay/PayReq$Options;
a=0;// 
a=0;// .field public packageValue:Ljava/lang/String;
a=0;// 
a=0;// .field public partnerId:Ljava/lang/String;
a=0;// 
a=0;// .field public prepayId:Ljava/lang/String;
a=0;// 
a=0;// .field public sign:Ljava/lang/String;
a=0;// 
a=0;// .field public timeStamp:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/tencent/mm/sdk/modelbase/BaseReq;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelpay/PayReq;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkArgs()Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->appId:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->appId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "MicroMsg.PaySdk.PayReq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, invalid appId"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->partnerId:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->partnerId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "MicroMsg.PaySdk.PayReq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, invalid partnerId"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->prepayId:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->prepayId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "MicroMsg.PaySdk.PayReq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, invalid prepayId"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->nonceStr:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->nonceStr:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "MicroMsg.PaySdk.PayReq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, invalid nonceStr"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->timeStamp:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->timeStamp:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "MicroMsg.PaySdk.PayReq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, invalid timeStamp"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->packageValue:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->packageValue:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_b
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "MicroMsg.PaySdk.PayReq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, invalid packageValue"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->sign:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->sign:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_d
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "MicroMsg.PaySdk.PayReq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, invalid sign"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->extData:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_e
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->extData:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x400
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-le v1, v2, :cond_e
a=0;// 
a=0;//     const-string v1, "MicroMsg.PaySdk.PayReq"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkArgs fail, extData length too long"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_e
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public fromBundle(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcom/tencent/mm/sdk/modelbase/BaseReq;->fromBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_appid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->appId:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_partnerid"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->partnerId:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_prepayid"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->prepayId:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_noncestr"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->nonceStr:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_timestamp"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->timeStamp:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_packagevalue"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->packageValue:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_sign"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->sign:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_extdata"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->extData:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelpay/PayReq$Options;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelpay/PayReq$Options;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/modelpay/PayReq$Options;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelpay/PayReq$Options;);
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->options:Lcom/tencent/mm/sdk/modelpay/PayReq$Options;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->options:Lcom/tencent/mm/sdk/modelpay/PayReq$Options;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/tencent/mm/sdk/modelpay/PayReq$Options;->fromBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getType()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toBundle(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0, p1}, Lcom/tencent/mm/sdk/modelbase/BaseReq;->toBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_appid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->appId:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_partnerid"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->partnerId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_prepayid"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->prepayId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_noncestr"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->nonceStr:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_timestamp"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->timeStamp:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_packagevalue"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->packageValue:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_sign"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->sign:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "_wxapi_payreq_extdata"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->extData:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->options:Lcom/tencent/mm/sdk/modelpay/PayReq$Options;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/modelpay/PayReq;->options:Lcom/tencent/mm/sdk/modelpay/PayReq$Options;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcom/tencent/mm/sdk/modelpay/PayReq$Options;->toBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
