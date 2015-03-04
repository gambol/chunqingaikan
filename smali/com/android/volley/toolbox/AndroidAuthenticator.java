package com.android.volley.toolbox; class AndroidAuthenticator { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/AndroidAuthenticator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AndroidAuthenticator.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/toolbox/Authenticator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mAccount:Landroid/accounts/Account;
a=0;// 
a=0;// .field private final mAuthTokenType:Ljava/lang/String;
a=0;// 
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private final mNotifyAuthFailure:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/accounts/Account;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "account"    # Landroid/accounts/Account;
a=0;//     .param p3, "authTokenType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/android/volley/toolbox/AndroidAuthenticator;-><init>(Landroid/content/Context;Landroid/accounts/Account;Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/AndroidAuthenticator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/accounts/Account;Ljava/lang/String;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "account"    # Landroid/accounts/Account;
a=0;//     .param p3, "authTokenType"    # Ljava/lang/String;
a=0;//     .param p4, "notifyAuthFailure"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 57
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/AndroidAuthenticator;);
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 58
a=0;//     iput-object p2, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mAccount:Landroid/accounts/Account;
a=0;// 
a=0;//     .line 59
a=0;//     iput-object p3, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mAuthTokenType:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     iput-boolean p4, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mNotifyAuthFailure:Z
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getAccount()Landroid/accounts/Account;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mAccount:Landroid/accounts/Account;
a=0;// 
a=0;//     #v0=(Reference,Landroid/accounts/Account;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAuthToken()Ljava/lang/String;
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     #v4=(Null);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "accountManager":Landroid/accounts/AccountManager;
a=0;//     #v0=(Reference,Landroid/accounts/AccountManager;);
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mAccount:Landroid/accounts/Account;
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v2, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mAuthTokenType:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v3, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mNotifyAuthFailure:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     .line 73
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/accounts/AccountManager;->getAuthToken(Landroid/accounts/Account;Ljava/lang/String;ZLandroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 77
a=0;//     .local v8, "future":Landroid/accounts/AccountManagerFuture;, "Landroid/accounts/AccountManagerFuture<Landroid/os/Bundle;>;"
a=0;//     :try_start_0
a=0;//     #v8=(Reference,Landroid/accounts/AccountManagerFuture;);
a=0;//     invoke-interface {v8}, Landroid/accounts/AccountManagerFuture;->getResult()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Landroid/os/Bundle;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 81
a=0;//     .local v10, "result":Landroid/os/Bundle;
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     .local v6, "authToken":Ljava/lang/String;
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v8}, Landroid/accounts/AccountManagerFuture;->isDone()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v8}, Landroid/accounts/AccountManagerFuture;->isCancelled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 83
a=0;//     const-string v1, "intent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     const-string v1, "intent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v9, Landroid/content/Intent;
a=0;// 
a=0;//     .line 85
a=0;//     .local v9, "intent":Landroid/content/Intent;
a=0;//     new-instance v1, Lcom/android/volley/AuthFailureError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/AuthFailureError;);
a=0;//     invoke-direct {v1, v9}, Lcom/android/volley/AuthFailureError;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/AuthFailureError;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 78
a=0;//     .end local v6    # "authToken":Ljava/lang/String;
a=0;//     .end local v9    # "intent":Landroid/content/Intent;
a=0;//     .end local v10    # "result":Landroid/os/Bundle;
a=0;//     :catch_0
a=0;//     #v6=(Uninit);v9=(Uninit);v10=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 79
a=0;//     .local v7, "e":Ljava/lang/Exception;
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/android/volley/AuthFailureError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/AuthFailureError;);
a=0;//     const-string v2, "Error while retrieving auth token"
a=0;// 
a=0;//     invoke-direct {v1, v2, v7}, Lcom/android/volley/AuthFailureError;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/AuthFailureError;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 87
a=0;//     .end local v7    # "e":Ljava/lang/Exception;
a=0;//     .restart local v6    # "authToken":Ljava/lang/String;
a=0;//     .restart local v10    # "result":Landroid/os/Bundle;
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v6=(Null);v7=(Uninit);v10=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "authtoken"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 89
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     new-instance v1, Lcom/android/volley/AuthFailureError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/AuthFailureError;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Got null auth token for type: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mAuthTokenType:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcom/android/volley/AuthFailureError;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/AuthFailureError;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 93
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Boolean);
a=0;//     return-object v6
a=0;// .end method
a=0;// 
a=0;// .method public invalidateAuthToken(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "authToken"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/android/volley/toolbox/AndroidAuthenticator;->mAccount:Landroid/accounts/Account;
a=0;// 
a=0;//     #v1=(Reference,Landroid/accounts/Account;);
a=0;//     iget-object v1, v1, Landroid/accounts/Account;->type:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/accounts/AccountManager;->invalidateAuthToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
}}
