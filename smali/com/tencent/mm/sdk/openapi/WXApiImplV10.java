package com.tencent.mm.sdk.openapi; class WXApiImplV10 { void a() { int a;
a=0;// .class final Lcom/tencent/mm/sdk/openapi/WXApiImplV10;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;// .field private static wxappPayEntryClassname:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private appId:Ljava/lang/String;
a=0;// 
a=0;// .field private checkSignature:Z
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private detached:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/openapi/WXApiImplV10;);
a=0;//     iput-boolean v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->checkSignature:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "<init>, appId = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", checkSignature = "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->appId:Ljava/lang/String;
a=0;// 
a=0;//     iput-boolean p3, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->checkSignature:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkSumConsistent([B[B)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     array-length v0, p2
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkSumConsistent fail, invalid arguments"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     array-length v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v0, v2, :cond_3
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checkSumConsistent fail, length is different"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     if-ge v0, v2, :cond_4
a=0;// 
a=0;//     aget-byte v2, p1, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aget-byte v3, p2, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private sendPayReq(Landroid/content/Context;Landroid/os/Bundle;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/a;);
a=0;//     invoke-direct {v0, p1}, Lcom/tencent/mm/sdk/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/a;);
a=0;//     const-string v1, "_wxapp_pay_entry_classname_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/mm/sdk/a;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "pay, set wxappPayEntryClassname = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     const-string v1, "pay fail, wxappPayEntryClassname is null"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/a/a$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/a/a$a;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/a/a$a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/a/a$a;);
a=0;//     iput-object p2, v0, Lcom/tencent/mm/sdk/a/a$a;->k:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "com.tencent.mm"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/a/a$a;->h:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/a/a$a;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/tencent/mm/sdk/a/a;->a(Landroid/content/Context;Lcom/tencent/mm/sdk/a/a$a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final detach()V
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "detach"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final getWXAppSupportAPI()I
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "getWXAppSupportAPI fail, WXMsgImpl has been detached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->isWXAppInstalled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "open wx app failed, not installed or signature check failed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/a;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Lcom/tencent/mm/sdk/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/a;);
a=0;//     const-string v2, "_build_info_sdk_int_"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/tencent/mm/sdk/a;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final handleIntent(Landroid/content/Intent;Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v2, "com.tencent.mm.openapi.token"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v2}, Lcom/tencent/mm/sdk/openapi/WXApiImplComm;->isIntentFromWx(Landroid/content/Intent;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "handleIntent fail, intent not from weixin msg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-boolean v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "handleIntent fail, WXMsgImpl has been detached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);
a=0;//     const-string v2, "_mmessage_content"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "_mmessage_sdkVersion"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const-string v4, "_mmessage_appPackage"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "invalid argument"
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);v5=(Integer);
a=0;//     const-string v5, "_mmessage_checksum"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v5}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v2, v3, v4}, Lcom/tencent/mm/sdk/a/a/b;->a(Ljava/lang/String;ILjava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0, v5, v2}, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->checkSumConsistent([B[B)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "checksum fail"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(One);v2=(Boolean);
a=0;//     const-string v2, "_wxapi_command_type"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "unknown cmd = "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v1=(One);v2=(Integer);v3=(Integer);
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelmsg/SendAuth$Resp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/SendAuth$Resp;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/mm/sdk/modelmsg/SendAuth$Resp;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/SendAuth$Resp;);
a=0;//     invoke-interface {p2, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/sdk/modelbase/BaseResp;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v2=(Integer);
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Resp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Resp;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Resp;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Resp;);
a=0;//     invoke-interface {p2, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/sdk/modelbase/BaseResp;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Null);v2=(Integer);
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelmsg/GetMessageFromWX$Req;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/GetMessageFromWX$Req;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/mm/sdk/modelmsg/GetMessageFromWX$Req;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/GetMessageFromWX$Req;);
a=0;//     invoke-interface {p2, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;->onReq(Lcom/tencent/mm/sdk/modelbase/BaseReq;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Null);v2=(Integer);
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/ShowMessageFromWX$Req;);
a=0;//     invoke-interface {p2, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;->onReq(Lcom/tencent/mm/sdk/modelbase/BaseReq;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Null);v2=(Integer);
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelpay/PayResp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelpay/PayResp;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/mm/sdk/modelpay/PayResp;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelpay/PayResp;);
a=0;//     invoke-interface {p2, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/sdk/modelbase/BaseResp;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Null);v2=(Integer);
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelmsg/LaunchFromWX$Req;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/LaunchFromWX$Req;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0, v2}, Lcom/tencent/mm/sdk/modelmsg/LaunchFromWX$Req;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/LaunchFromWX$Req;);
a=0;//     invoke-interface {p2, v0}, Lcom/tencent/mm/sdk/openapi/IWXAPIEventHandler;->onReq(Lcom/tencent/mm/sdk/modelbase/BaseReq;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final isWXAppInstalled()Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "isWXAppInstalled fail, WXMsgImpl has been detached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "com.tencent.mm"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0x40
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/String;);v3=(PosByte);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     iget-boolean v3, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->checkSignature:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v2, v1, v3}, Lcom/tencent/mm/sdk/openapi/WXApiImplComm;->validateAppSignature(Landroid/content/Context;[Landroid/content/pm/Signature;Z)Z
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final isWXAppSupportAPI()Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "isWXAppSupportAPI fail, WXMsgImpl has been detached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->getWXAppSupportAPI()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v1, 0x22010003
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final openWXApp()Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "openWXApp fail, WXMsgImpl has been detached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->isWXAppInstalled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "open wx app failed, not installed or signature check failed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "com.tencent.mm"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "startActivity fail, exception = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final registerApp(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "registerApp fail, WXMsgImpl has been detached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "com.tencent.mm"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->checkSignature:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/mm/sdk/openapi/WXApiImplComm;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "register app failed for wechat app signature check failed"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "registerApp, appId = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->appId:Ljava/lang/String;
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "register app "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
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
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/a/a/a$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/a/a/a$a;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/a/a/a$a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/a/a/a$a;);
a=0;//     const-string v1, "com.tencent.mm"
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/a/a/a$a;->l:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER"
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/a/a/a$a;->m:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "weixin://registerapp?appid="
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->appId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/a/a/a$a;->j:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/mm/sdk/a/a/a;->a(Landroid/content/Context;Lcom/tencent/mm/sdk/a/a/a$a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final sendReq(Lcom/tencent/mm/sdk/modelbase/BaseReq;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "sendReq fail, WXMsgImpl has been detached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "com.tencent.mm"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v3, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->checkSignature:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v1, v2, v3}, Lcom/tencent/mm/sdk/openapi/WXApiImplComm;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "sendReq failed for wechat app signature check failed"
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/tencent/mm/sdk/modelbase/BaseReq;->checkArgs()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "sendReq checkArgs fail"
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "sendReq, req type = "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Lcom/tencent/mm/sdk/modelbase/BaseReq;->getType()I
a=0;// 
a=0;//     move-result v2
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
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Lcom/tencent/mm/sdk/modelbase/BaseReq;->toBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/tencent/mm/sdk/modelbase/BaseReq;->getType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->sendPayReq(Landroid/content/Context;Landroid/os/Bundle;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/os/Bundle;);v1=(Integer);
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/a/a$a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/a/a$a;);
a=0;//     invoke-direct {v1}, Lcom/tencent/mm/sdk/a/a$a;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/a/a$a;);
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/a/a$a;->k:Landroid/os/Bundle;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "weixin://sendreq?appid="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->appId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/a/a$a;->j:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "com.tencent.mm"
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/a/a$a;->h:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "com.tencent.mm.plugin.base.stub.WXEntryActivity"
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/a/a$a;->i:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/a/a;->a(Landroid/content/Context;Lcom/tencent/mm/sdk/a/a$a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final sendResp(Lcom/tencent/mm/sdk/modelbase/BaseResp;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "sendResp fail, WXMsgImpl has been detached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "com.tencent.mm"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v3, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->checkSignature:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v1, v2, v3}, Lcom/tencent/mm/sdk/openapi/WXApiImplComm;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "sendResp failed for wechat app signature check failed"
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     invoke-virtual {p1}, Lcom/tencent/mm/sdk/modelbase/BaseResp;->checkArgs()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "sendResp checkArgs fail"
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v0}, Lcom/tencent/mm/sdk/modelbase/BaseResp;->toBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/a/a$a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/a/a$a;);
a=0;//     invoke-direct {v1}, Lcom/tencent/mm/sdk/a/a$a;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/a/a$a;);
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/a/a$a;->k:Landroid/os/Bundle;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "weixin://sendresp?appid="
a=0;// 
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->appId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/a/a$a;->j:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "com.tencent.mm"
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/a/a$a;->h:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "com.tencent.mm.plugin.base.stub.WXEntryActivity"
a=0;// 
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/a/a$a;->i:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/a/a;->a(Landroid/content/Context;Lcom/tencent/mm/sdk/a/a$a;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final unregisterApp()V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->detached:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "unregisterApp fail, WXMsgImpl has been detached"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "com.tencent.mm"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->checkSignature:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/mm/sdk/openapi/WXApiImplComm;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "unregister app failed for wechat app signature check failed"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Boolean);
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "unregisterApp, appId = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->appId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->appId:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->appId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "unregisterApp fail, appId is empty"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "MicroMsg.SDK.WXApiImplV10"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "unregister app "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
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
a=0;//     invoke-static {v0, v1}, Lcom/tencent/mm/sdk/b/a;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/a/a/a$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/a/a/a$a;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/a/a/a$a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/a/a/a$a;);
a=0;//     const-string v1, "com.tencent.mm"
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/a/a/a$a;->l:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_UNREGISTER"
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/a/a/a$a;->m:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "weixin://unregisterapp?appid="
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->appId:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/a/a/a$a;->j:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/mm/sdk/openapi/WXApiImplV10;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/mm/sdk/a/a/a;->a(Landroid/content/Context;Lcom/tencent/mm/sdk/a/a/a$a;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
