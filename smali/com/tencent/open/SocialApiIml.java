package com.tencent.open; class SocialApiIml { void a() { int a;
a=0;// .class public Lcom/tencent/open/SocialApiIml;
a=0;// .super Lcom/tencent/connect/common/BaseApi;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/open/SocialApiIml$c;,
a=0;//         Lcom/tencent/open/SocialApiIml$a;,
a=0;//         Lcom/tencent/open/SocialApiIml$b;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private b:Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Lcom/tencent/open/SocialApiIml;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/tencent/open/SocialApiIml;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)Lcom/tencent/open/SocialApiIml$b;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 267
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v1, Lcom/tencent/connect/common/Constants;->PACKAGE_QZONE:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "com.tencent.open.agent.AgentActivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 269
a=0;//     new-instance v1, Lcom/tencent/open/SocialApiIml$b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/SocialApiIml$b;);
a=0;//     invoke-direct {v1}, Lcom/tencent/open/SocialApiIml$b;-><init>()V
a=0;// 
a=0;//     .line 271
a=0;//     #v1=(Reference,Lcom/tencent/open/SocialApiIml$b;);
a=0;//     iput-object v0, v1, Lcom/tencent/open/SocialApiIml$b;->a:Landroid/content/Intent;
a=0;// 
a=0;//     .line 272
a=0;//     iput-object p1, v1, Lcom/tencent/open/SocialApiIml$b;->c:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 273
a=0;//     iput-object p3, v1, Lcom/tencent/open/SocialApiIml$b;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 274
a=0;//     iput-object p4, v1, Lcom/tencent/open/SocialApiIml$b;->e:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 275
a=0;//     iput-object p2, v1, Lcom/tencent/open/SocialApiIml$b;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 276
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 444
a=0;//     const-string v0, "SocialApiIml"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "SocialApiIml handleIntent "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " params="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " activityIntent="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 445
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 446
a=0;//     const-string v0, "key_action"
a=0;// 
a=0;//     invoke-virtual {p2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 447
a=0;//     const-string v0, "key_params"
a=0;// 
a=0;//     invoke-virtual {p2, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 449
a=0;//     iput-object p2, p0, Lcom/tencent/open/SocialApiIml;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 450
a=0;//     invoke-virtual {p0, p1, p6}, Lcom/tencent/open/SocialApiIml;->startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 486
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 453
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "com.tencent.open.agent.AgentActivity"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/SocialApiIml;->getTargetActivityIntent(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 454
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v0, Lcom/tencent/open/SocialApiIml$c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/SocialApiIml$c;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move-object v2, p6
a=0;// 
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p5
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/open/SocialApiIml$c;-><init>(Lcom/tencent/open/SocialApiIml;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 456
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApiIml$c;);
a=0;//     const-string v1, "com.tencent.open.agent.EncryTokenActivity"
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/tencent/open/SocialApiIml;->getTargetActivityIntent(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 459
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 464
a=0;//     const-string v2, "oauth_consumer_key"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 465
a=0;//     const-string v2, "openid"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 466
a=0;//     const-string v2, "access_token"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 467
a=0;//     const-string v2, "key_action"
a=0;// 
a=0;//     const-string v3, "action_check_token"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 468
a=0;//     iput-object v1, p0, Lcom/tencent/open/SocialApiIml;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 469
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->hasActivityForIntent()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 470
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/tencent/open/SocialApiIml;->startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 473
a=0;//     :cond_2
a=0;//     #v1=(Reference,Landroid/content/Intent;);v2=(Conflicted);
a=0;//     const-string v1, "tencent&sdk&qazxc***14969%%"
a=0;// 
a=0;//     .line 474
a=0;//     const-string v2, "qzone3.4"
a=0;// 
a=0;//     .line 475
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 477
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 479
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "encry_token"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 483
a=0;//     :goto_1
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/open/SocialApiIml$c;->onComplete(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 480
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 481
a=0;//     invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 423
a=0;//     const-string v0, "com.tencent.open.agent.voice"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/SocialApiIml;->getAgentIntentWithTarget(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 424
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "http://qzs.qq.com/open/mobile/not_support.html?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 426
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 428
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 429
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     const-string v1, "\u8bf7\u7a0d\u5019"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 431
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 434
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "action_voice"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p2, v0, v5, p3}, Lcom/tencent/open/SocialApiIml;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)Lcom/tencent/open/SocialApiIml$b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 435
a=0;//     const-string v1, "action_voice"
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/open/SocialApiIml$a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/open/SocialApiIml$a;);
a=0;//     invoke-direct {v2, p0, v0}, Lcom/tencent/open/SocialApiIml$a;-><init>(Lcom/tencent/open/SocialApiIml;Lcom/tencent/open/SocialApiIml$b;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/SocialApiIml$a;);
a=0;//     invoke-virtual {p0, p1, v1, v2}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 440
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 439
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Uninit);v6=(Uninit);
a=0;//     const-string v3, "action_voice"
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApiIml;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     .line 120
a=0;//     const-string v0, "com.tencent.open.agent.RequestFreegiftActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/SocialApiIml;->getAgentIntentWithTarget(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 121
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->composeActivityParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 122
a=0;//     const-string v0, "action_ask"
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 123
a=0;//     const-string v0, "type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "request"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/ServerSetting;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "http://qzs.qq.com/open/mobile/request/sdk_request.html?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     .line 128
a=0;//     #v6=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// 
a=0;//     .line 124
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "action_gift"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     const-string v0, "type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "freegift"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 499
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "OpenUi, showDialog --start"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 500
a=0;//     invoke-static {p1}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;
a=0;// 
a=0;//     .line 501
a=0;//     const-string v0, "oauth_consumer_key"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 503
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 504
a=0;//     const-string v0, "access_token"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 507
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 508
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 509
a=0;//     const-string v1, "openid"
a=0;// 
a=0;//     invoke-virtual {p3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 514
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "pfStore"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 517
a=0;//     const-string v1, "pf"
a=0;// 
a=0;//     const-string v2, "openmobile_android"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 519
a=0;//     const-string v1, "pf"
a=0;// 
a=0;//     invoke-virtual {p3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 525
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 526
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 527
a=0;//     invoke-static {p3}, Lcom/tencent/utils/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 529
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 531
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     const-string v1, "OpenUi, showDialog TDialog"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 532
a=0;//     const-string v0, "action_challenge"
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const-string v0, "action_brag"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 533
a=0;//     :cond_2
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "OpenUi, showDialog PKDialog"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 534
a=0;//     new-instance v0, Lcom/tencent/open/PKDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/PKDialog;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p5
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/open/PKDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/PKDialog;->show()V
a=0;// 
a=0;//     .line 538
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     .line 520
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 521
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 522
a=0;//     const-string v0, "pf"
a=0;// 
a=0;//     const-string v1, "openmobile_android"
a=0;// 
a=0;//     invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 536
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/tencent/open/TDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/open/TDialog;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p5
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/tencent/open/TDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TDialog;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/TDialog;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/open/SocialApiIml;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Lcom/tencent/open/SocialApiIml;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/open/SocialApiIml;Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct/range {p0 .. p6}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/open/SocialApiIml;Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/open/SocialApiIml;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct/range {p0 .. p5}, Lcom/tencent/open/SocialApiIml;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/open/SocialApiIml;)Landroid/app/Activity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 298
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 300
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/tencent/open/SocialApiIml;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 632
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 633
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v1, Lcom/tencent/connect/common/Constants;->PACKAGE_QZONE:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "com.tencent.open.agent.AgentActivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 635
a=0;//     const-string v1, "key_action"
a=0;// 
a=0;//     const-string v2, "action_check"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 636
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 637
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "apiName"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 639
a=0;//     const-string v2, "key_params"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 640
a=0;//     iput-object v0, p0, Lcom/tencent/open/SocialApiIml;->mActivityIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual {p0, p1, p3}, Lcom/tencent/open/SocialApiIml;->startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 643
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected a()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 620
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 621
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "com.tencent.open.agent.CheckFunctionActivity"
a=0;// 
a=0;//     .line 622
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/tencent/connect/common/Constants;->PACKAGE_QZONE:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 624
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/utils/SystemUtils;->isActivityExist(Landroid/content/Context;Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public ask(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     const-string v0, "action_ask"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0, p2, p3}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public brag(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     .line 145
a=0;//     const-string v0, "com.tencent.open.agent.BragActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/SocialApiIml;->getAgentIntentWithTarget(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 146
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->composeActivityParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 147
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "http://qzs.qq.com/open/mobile/brag/sdk_brag.html?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 148
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "action_brag"
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public challenge(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     .line 165
a=0;//     const-string v0, "com.tencent.open.agent.ChallengeActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/SocialApiIml;->getAgentIntentWithTarget(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 166
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->composeActivityParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 167
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "http://qzs.qq.com/open/mobile/brag/sdk_brag.html?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 168
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "action_challenge"
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 169
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public gift(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     const-string v0, "action_gift"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p1, v0, p2, p3}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public grade(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->composeActivityParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 227
a=0;//     const-string v0, "version"
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 229
a=0;//     const-string v0, "com.tencent.open.agent.AppGradeActivity"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/SocialApiIml;->getAgentIntentWithTarget(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 231
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     const-string v1, "\u8bf7\u7a0d\u5019..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 253
a=0;//     const-string v0, "http://qzs.qq.com/open/mobile/rate/sdk_rate.html?"
a=0;// 
a=0;//     .line 254
a=0;//     const-string v1, "action_grade"
a=0;// 
a=0;//     invoke-direct {p0, p2, v1, v0, p3}, Lcom/tencent/open/SocialApiIml;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)Lcom/tencent/open/SocialApiIml$b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 255
a=0;//     const-string v1, "action_grade"
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/open/SocialApiIml$a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/open/SocialApiIml$a;);
a=0;//     invoke-direct {v2, p0, v0}, Lcom/tencent/open/SocialApiIml$a;-><init>(Lcom/tencent/open/SocialApiIml;Lcom/tencent/open/SocialApiIml$b;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/SocialApiIml$a;);
a=0;//     invoke-virtual {p0, p1, v1, v2}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 263
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 261
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v5, "http://qzs.qq.com/open/mobile/rate/sdk_rate.html?"
a=0;// 
a=0;//     .line 262
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "action_grade"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/SocialApiIml;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public invite(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     .line 185
a=0;//     const-string v0, "com.tencent.open.agent.AppInvitationActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/SocialApiIml;->getAgentIntentWithTarget(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 186
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->composeActivityParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 187
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "http://qzs.qq.com/open/mobile/invite/sdk_invite.html?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 188
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "action_invite"
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public reactive(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     .line 97
a=0;//     const-string v0, "com.tencent.open.agent.ReactiveActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/SocialApiIml;->getAgentIntentWithTarget(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 98
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->composeActivityParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 99
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "http://qzs.qq.com/open/mobile/reactive/sdk_reactive.html?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 100
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     const-string v1, "\u8bf7\u7a0d\u5019..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 106
a=0;//     const-string v0, "type"
a=0;// 
a=0;//     const-string v1, "reactive"
a=0;// 
a=0;//     invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 107
a=0;//     const-string v0, "action_reactive"
a=0;// 
a=0;//     invoke-direct {p0, p2, v0, v5, p3}, Lcom/tencent/open/SocialApiIml;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)Lcom/tencent/open/SocialApiIml$b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 108
a=0;//     const-string v1, "action_reactive"
a=0;// 
a=0;//     new-instance v2, Lcom/tencent/open/SocialApiIml$a;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/open/SocialApiIml$a;);
a=0;//     invoke-direct {v2, p0, v0}, Lcom/tencent/open/SocialApiIml$a;-><init>(Lcom/tencent/open/SocialApiIml;Lcom/tencent/open/SocialApiIml$b;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/SocialApiIml$a;);
a=0;//     invoke-virtual {p0, p1, v1, v2}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 116
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "img"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     const-string v1, "sendImg"
a=0;// 
a=0;//     invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     const-string v0, "img"
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 115
a=0;//     const-string v3, "action_reactive"
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public story(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     .line 205
a=0;//     const-string v0, "com.tencent.open.agent.SendStoryActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/open/SocialApiIml;->getAgentIntentWithTarget(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 206
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->composeActivityParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 207
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "http://qzs.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 208
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "action_story"
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public voice(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     const-string v0, "voice"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "voice params="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 368
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml;->b:Landroid/app/Activity;
a=0;// 
a=0;//     .line 369
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/SocialApiIml;->composeActivityParams()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 370
a=0;//     const-string v0, "version"
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/utils/Util;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 372
a=0;//     invoke-static {}, Lcom/tencent/open/c;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 373
a=0;//     new-instance v0, Lcom/tencent/tauth/UiError;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/tauth/UiError;);
a=0;//     const/16 v1, -0xc
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const-string v2, "\u68c0\u6d4b\u4e0d\u5230SD\u5361\uff0c\u65e0\u6cd5\u53d1\u9001\u8bed\u97f3\uff01"
a=0;// 
a=0;//     const-string v3, "\u68c0\u6d4b\u4e0d\u5230SD\u5361\uff0c\u65e0\u6cd5\u53d1\u9001\u8bed\u97f3\uff01"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 374
a=0;//     #v0=(Reference,Lcom/tencent/tauth/UiError;);
a=0;//     invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 413
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 378
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v3=(Uninit);
a=0;//     const-string v0, "image_date"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 379
a=0;//     const-string v0, "image_date"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 381
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 384
a=0;//     new-instance v1, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v1, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ProgressDialog;);
a=0;//     iput-object v1, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 385
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     const-string v2, "\u8bf7\u7a0d\u5019\uff0c\u6b63\u5728\u67e5\u8be2\u2026"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 386
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml;->a:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 388
a=0;//     new-instance v1, Lcom/tencent/open/c;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/open/c;);
a=0;//     new-instance v2, Lcom/tencent/open/SocialApiIml$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/open/SocialApiIml$1;);
a=0;//     invoke-direct {v2, p0, p2, p1, p3}, Lcom/tencent/open/SocialApiIml$1;-><init>(Lcom/tencent/open/SocialApiIml;Landroid/os/Bundle;Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/SocialApiIml$1;);
a=0;//     invoke-direct {v1, v2}, Lcom/tencent/open/c;-><init>(Lcom/tencent/open/c$a;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/c;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v2=(Reference,[Landroid/graphics/Bitmap;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/tencent/open/c;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 412
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Uninit);
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/open/SocialApiIml;->a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public writeEncryToken(Landroid/content/Context;)V
a=0;//     .locals 8
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "SetJavaScriptEnabled"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 591
a=0;//     #v7=(One);
a=0;//     const-string v1, "tencent&sdk&qazxc***14969%%"
a=0;// 
a=0;//     .line 592
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 593
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 594
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 595
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "qzone3.4"
a=0;// 
a=0;//     .line 596
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 597
a=0;//     #v0=(Null);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     .line 599
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 601
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);
a=0;//     new-instance v0, Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/webkit/WebView;);
a=0;//     invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 602
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 603
a=0;//     invoke-virtual {v2, v7}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
a=0;// 
a=0;//     .line 604
a=0;//     invoke-virtual {v2, v7}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 605
a=0;//     invoke-virtual {v2, v7}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V
a=0;// 
a=0;//     .line 606
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "<!DOCTYPE HTML><html lang=\"en-US\"><head><meta charset=\"UTF-8\"><title>localStorage Test</title><script type=\"text/javascript\">document.domain = \'qq.com\';localStorage[\""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "_"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml;->mToken:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\"]=\""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\";</script></head><body></body></html>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 613
a=0;//     invoke-static {}, Lcom/tencent/utils/ServerSetting;->getInstance()Lcom/tencent/utils/ServerSetting;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "http://qzs.qq.com"
a=0;// 
a=0;//     invoke-virtual {v1, p1, v3}, Lcom/tencent/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 615
a=0;//     const-string v3, "text/html"
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     move-object v5, v1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 617
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
