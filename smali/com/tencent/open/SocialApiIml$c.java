package com.tencent.open; class SocialApiIml$c { void a() { int a;
a=0;// .class Lcom/tencent/open/SocialApiIml$c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/SocialApiIml;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "c"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;// .field private b:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:Ljava/lang/String;
a=0;// 
a=0;// .field private e:Landroid/os/Bundle;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/open/SocialApiIml;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 546
a=0;//     iput-object p1, p0, Lcom/tencent/open/SocialApiIml$c;->a:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 547
a=0;//     #p0=(Reference,Lcom/tencent/open/SocialApiIml$c;);
a=0;//     iput-object p2, p0, Lcom/tencent/open/SocialApiIml$c;->b:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 548
a=0;//     iput-object p3, p0, Lcom/tencent/open/SocialApiIml$c;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 549
a=0;//     iput-object p4, p0, Lcom/tencent/open/SocialApiIml$c;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 550
a=0;//     iput-object p5, p0, Lcom/tencent/open/SocialApiIml$c;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 551
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 585
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$c;->b:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V
a=0;// 
a=0;//     .line 586
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Ljava/lang/Object;)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 555
a=0;//     check-cast p1, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 556
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 558
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     const-string v1, "encry_token"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, v0
a=0;// 
a=0;//     .line 565
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$c;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "encrytoken"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 566
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$c;->a:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml$c;->a:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/open/SocialApiIml;->b(Lcom/tencent/open/SocialApiIml;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/open/SocialApiIml$c;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/tencent/open/SocialApiIml$c;->e:Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v4, p0, Lcom/tencent/open/SocialApiIml$c;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/tencent/open/SocialApiIml$c;->b:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     #v5=(Reference,Lcom/tencent/tauth/IUiListener;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/tencent/open/SocialApiIml;->a(Lcom/tencent/open/SocialApiIml;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 570
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 571
a=0;//     const-string v0, "miles"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "The token get from qq or qzone is empty. Write temp token to localstorage."
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 572
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$c;->a:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/SocialApiIml$c;->a:Lcom/tencent/open/SocialApiIml;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/open/SocialApiIml;->c(Lcom/tencent/open/SocialApiIml;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/open/SocialApiIml;->writeEncryToken(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 574
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 559
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 560
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     .line 561
a=0;//     const-string v2, "openSDK_LOG"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "OpenApi, EncrytokenListener() onComplete error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lcom/tencent/b/a/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/tencent/tauth/UiError;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 578
a=0;//     const-string v0, "openSDK_LOG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "OpenApi, EncryptTokenListener() onError"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p1, Lcom/tencent/tauth/UiError;->errorMessage:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/b/a/g;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 580
a=0;//     iget-object v0, p0, Lcom/tencent/open/SocialApiIml$c;->b:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
a=0;// 
a=0;//     .line 581
a=0;//     return-void
a=0;// .end method
}}
