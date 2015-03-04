package com.weibo.sdk.android; class Weibo$1 { void a() { int a;
a=0;// .class Lcom/weibo/sdk/android/Weibo$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Weibo.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/weibo/sdk/android/Weibo;->startAuthDialog(Landroid/content/Context;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;// .field private final synthetic val$listener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/weibo/sdk/android/Weibo;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/weibo/sdk/android/Weibo$1;->val$listener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     .line 67
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/Weibo$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCancel()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     const-string v0, "Weibo-authorize"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Login canceled"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->val$listener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     invoke-interface {v0}, Lcom/weibo/sdk/android/WeiboAuthListener;->onCancel()V
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onComplete(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "values"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/CookieSyncManager;);
a=0;//     invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     new-instance v1, Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     invoke-direct {v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     iput-object v1, v0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     const-string v1, "access_token"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->setToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     const-string v1, "expires_in"
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->setExpiresIn(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     const-string v1, "refresh_token"
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->setRefreshToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/weibo/sdk/android/Oauth2AccessToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     const-string v0, "Weibo-authorize"
a=0;// 
a=0;//     .line 80
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Login Success! access_token="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/weibo/sdk/android/Oauth2AccessToken;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " expires="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v2, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/weibo/sdk/android/Oauth2AccessToken;->getExpiresTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " refresh_token="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v2, p0, Lcom/weibo/sdk/android/Weibo$1;->this$0:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/weibo/sdk/android/Weibo;->accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/weibo/sdk/android/Oauth2AccessToken;->getRefreshToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 79
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->val$listener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/weibo/sdk/android/WeiboAuthListener;->onComplete(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 88
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 85
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "Weibo-authorize"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Failed to receive access token"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->val$listener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     new-instance v1, Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     const-string v2, "Failed to receive access token."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Lcom/weibo/sdk/android/WeiboException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/WeiboException;);
a=0;//     invoke-interface {v0, v1}, Lcom/weibo/sdk/android/WeiboAuthListener;->onWeiboException(Lcom/weibo/sdk/android/WeiboException;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcom/weibo/sdk/android/WeiboDialogError;)V
a=0;//     .locals 3
a=0;//     .param p1, "error"    # Lcom/weibo/sdk/android/WeiboDialogError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     const-string v0, "Weibo-authorize"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Login failed: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->val$listener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/weibo/sdk/android/WeiboAuthListener;->onError(Lcom/weibo/sdk/android/WeiboDialogError;)V
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onWeiboException(Lcom/weibo/sdk/android/WeiboException;)V
a=0;//     .locals 3
a=0;//     .param p1, "error"    # Lcom/weibo/sdk/android/WeiboException;
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     const-string v0, "Weibo-authorize"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Login failed: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Weibo$1;->val$listener:Lcom/weibo/sdk/android/WeiboAuthListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/weibo/sdk/android/WeiboAuthListener;->onWeiboException(Lcom/weibo/sdk/android/WeiboException;)V
a=0;// 
a=0;//     .line 100
a=0;//     return-void
a=0;// .end method
}}
