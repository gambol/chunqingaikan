package com.cmcc.omp.security; class CmccOmpSecurityInterface { void a() { int a;
a=0;// .class public Lcom/cmcc/omp/security/CmccOmpSecurityInterface;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CmccOmpSecurityInterface.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final version:Ljava/lang/String; = "OMSS-SICHUAN-1.5.1.20130618"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 6
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/cmcc/omp/security/CmccOmpSecurityInterface;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static EnablerCallingBySSO(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;[B)Ljava/util/Hashtable;
a=0;//     .locals 5
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;//     .param p2, "pid"    # Ljava/lang/String;
a=0;//     .param p3, "channelId"    # Ljava/lang/String;
a=0;//     .param p4, "method"    # Ljava/lang/String;
a=0;//     .param p6, "httpbody"    # [B
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;[B)",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     .local p5, "httphead":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "001100"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 52
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     .local v0, "hs":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkURL(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "stateCode":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     const-string v2, "errorCode"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 73
a=0;//     .end local v0    # "hs":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 58
a=0;//     .restart local v0    # "hs":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_1
a=0;//     #v4=(Uninit);
a=0;//     invoke-static {p1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkAppid(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 59
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 60
a=0;//     const-string v2, "errorCode"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 63
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Uninit);
a=0;//     invoke-static {p2}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkPid(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 64
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 65
a=0;//     const-string v2, "errorCode"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Uninit);
a=0;//     invoke-static {p3}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkChannelId(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 69
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 70
a=0;//     const-string v2, "errorCode"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Uninit);
a=0;//     invoke-static/range {p0 .. p6}, Lcom/cmcc/omp/security/CmccOmpEnableCallingBySSO;->enablerCallingBySSO(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;[B)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static InitOmpEnvBySSO(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "appid"    # Ljava/lang/String;
a=0;//     .param p3, "pid"    # Ljava/lang/String;
a=0;//     .param p4, "channelId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkCtx(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 21
a=0;//     .local v0, "stateCode":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 42
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 24
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkURL(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 25
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 26
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 28
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p2}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkAppid2(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 29
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 30
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p3}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkPid2(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 33
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 34
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 36
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p4}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkChannelId2(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 37
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 38
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :cond_4
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpUtility;->InitUnZip(Landroid/content/Context;)I
a=0;// 
a=0;//     .line 41
a=0;//     sput-object p1, Lcom/cmcc/omp/security/CmccOmpUtility;->init_Url:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     invoke-static {p0, p1, p2, p3, p4}, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->InitOmpEnvLight(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getEncryptedContentByOffCharge(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;//     .locals 6
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;//     .param p2, "pid"    # Ljava/lang/String;
a=0;//     .param p3, "channelId"    # Ljava/lang/String;
a=0;//     .param p4, "plaincontent"    # Ljava/lang/String;
a=0;//     .param p5, "enccontent"    # Ljava/lang/String;
a=0;//     .param p6, "ExData"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     .line 116
a=0;//     .local v0, "hash":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkCtx(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 117
a=0;//     .local v2, "stateCode":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     const-string v3, "errorCode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 144
a=0;//     .end local v0    # "hash":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .local v1, "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 121
a=0;//     .end local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .restart local v0    # "hash":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {p1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkAppid2(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 122
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 123
a=0;//     const-string v3, "errorCode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 124
a=0;//     .restart local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     .end local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {p2}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkPid2(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 127
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 128
a=0;//     const-string v3, "errorCode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 129
a=0;//     .restart local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 131
a=0;//     .end local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {p3}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkChannelId2(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 132
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 133
a=0;//     const-string v3, "errorCode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 134
a=0;//     .restart local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     .end local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {p6}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkExData(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 138
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 139
a=0;//     const-string v3, "errorCode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 140
a=0;//     .restart local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     .end local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static/range {p0 .. p6}, Lcom/cmcc/omp/security/CmccOmpGetEncryptedContentBySSO;->getEncryptedContentBySSO(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 144
a=0;//     .restart local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getEncryptedContentBySSO(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;//     .locals 6
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;//     .param p2, "pid"    # Ljava/lang/String;
a=0;//     .param p3, "channelId"    # Ljava/lang/String;
a=0;//     .param p4, "plaincontent"    # Ljava/lang/String;
a=0;//     .param p5, "enccontent"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0xe
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "001100"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 81
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "hash":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkCtx(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 83
a=0;//     .local v2, "stateCode":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     const-string v3, "errorCode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 104
a=0;//     .end local v0    # "hash":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .local v1, "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 87
a=0;//     .end local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .restart local v0    # "hash":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v5=(Uninit);
a=0;//     invoke-static {p1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkAppid(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 88
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 89
a=0;//     const-string v3, "errorCode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 90
a=0;//     .restart local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     .end local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v3=(Conflicted);v4=(Conflicted);v5=(Uninit);
a=0;//     invoke-static {p2}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkPid(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 93
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 94
a=0;//     const-string v3, "errorCode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 95
a=0;//     .restart local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     .end local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v3=(Conflicted);v4=(Conflicted);v5=(Uninit);
a=0;//     invoke-static {p3}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkChannelId(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 98
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 99
a=0;//     const-string v3, "errorCode"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 100
a=0;//     .restart local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 103
a=0;//     .end local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v3=(Conflicted);v4=(Conflicted);v5=(Uninit);
a=0;//     invoke-static/range {p0 .. p5}, Lcom/cmcc/omp/security/CmccOmpGetEncryptedContentBySSO;->getEncryptedContentBySSO(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 104
a=0;//     .restart local v1    # "hash":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v1=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getVersion()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     const-string v0, "OMSS-SICHUAN-1.5.1.20130618"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
