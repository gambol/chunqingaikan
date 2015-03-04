package com.cmcc.omp.security; class CmccOmpGetEncryptedContentBySSO { void a() { int a;
a=0;// .class public Lcom/cmcc/omp/security/CmccOmpGetEncryptedContentBySSO;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CmccOmpGetEncryptedContentBySSO.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ENC:Ljava/lang/String; = "encryptedContent"
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/cmcc/omp/security/CmccOmpGetEncryptedContentBySSO;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static getEncryptedContentBySSO(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;//     .locals 9
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
a=0;//     const/16 v8, 0xa
a=0;// 
a=0;//     .line 18
a=0;//     #v8=(PosByte);
a=0;//     const-string v6, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "CmccOmpGetEncryptedContentBySSO is calling......start"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 19
a=0;//     new-instance v5, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v5}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     .local v5, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v5=(Reference,Ljava/util/Hashtable;);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     const/16 v7, 0x5b
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-eq v6, v7, :cond_1
a=0;// 
a=0;//     .line 22
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v6, "errorCode"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "5100"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 23
a=0;//     const-string v6, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     const-string v7, "errorCode:5100; input plaincontent error!"
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 27
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Integer);v7=(PosByte);v8=(PosByte);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 28
a=0;//     .local v0, "ENCCONTENT":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p5, :cond_2
a=0;// 
a=0;//     invoke-virtual {p5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 29
a=0;//     :cond_2
a=0;//     const-string v6, "errorCode"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "5100"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 30
a=0;//     const-string v6, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     const-string v7, "errorCode:5100; input enccontent error!"
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 34
a=0;//     :cond_3
a=0;//     :try_start_0
a=0;//     #v6=(Integer);v7=(PosByte);
a=0;//     invoke-virtual {p5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-le v6, v8, :cond_6
a=0;// 
a=0;//     .line 35
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     invoke-virtual {p5, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 37
a=0;//     const-string v6, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "enccontent length is :"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 50
a=0;//     :goto_1
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->initSharedPreferences(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpUtility;->InitUnZip(Landroid/content/Context;)I
a=0;// 
a=0;//     .line 52
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getSMSCounter()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 55
a=0;//     .local v2, "counter":Ljava/lang/String;
a=0;//     :goto_2
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-lt v6, v7, :cond_7
a=0;// 
a=0;//     .line 60
a=0;//     :cond_4
a=0;//     #v7=(Conflicted);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 59
a=0;//     invoke-static {p0, v2, p4, v0, v6}, Lcom/cmcc/omp/security/CmccOmpUtility;->getEncryptedInfo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 62
a=0;//     .local v4, "encryptedInfo":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_8
a=0;// 
a=0;//     .line 63
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "errorCode"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "5107"
a=0;// 
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 64
a=0;//     const-string v6, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     const-string v7, "encryptedInfo is error"
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 39
a=0;//     .end local v2    # "counter":Ljava/lang/String;
a=0;//     .end local v4    # "encryptedInfo":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);v4=(Uninit);v6=(Integer);v7=(PosByte);v8=(PosByte);
a=0;//     const-string v6, "%10s"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object p5, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 41
a=0;//     const-string v6, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "enccontent length is :"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 43
a=0;//     :catch_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 44
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 45
a=0;//     const-string v6, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "errorCode:5100; input enccontent error!"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 46
a=0;//     const-string v6, "errorCode"
a=0;// 
a=0;//     const-string v7, "5100"
a=0;// 
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     .end local v3    # "e":Ljava/lang/Exception;
a=0;//     .restart local v2    # "counter":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Uninit);v6=(Integer);v7=(PosByte);v8=(Integer);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "0"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 68
a=0;//     .restart local v4    # "encryptedInfo":Ljava/lang/String;
a=0;//     :cond_8
a=0;//     #v4=(Reference,Ljava/lang/String;);v6=(Integer);
a=0;//     const-string v6, "\u52a0\u5bc6\u540e"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "----\u957f\u5ea6\u4e3a\uff1a"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 71
a=0;//     :try_start_2
a=0;//     const-string v6, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 77
a=0;//     .local v1, "cipherContent":[B
a=0;//     #v1=(Reference,[B);
a=0;//     const-string v6, "errorCode"
a=0;// 
a=0;//     const-string v7, "0"
a=0;// 
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 78
a=0;//     const-string v6, "encryptedContent"
a=0;// 
a=0;//     invoke-virtual {v5, v6, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     .end local v1    # "cipherContent":[B
a=0;//     :catch_1
a=0;//     #v1=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 73
a=0;//     .restart local v3    # "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v6, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "ERROR MESSAGE is:5102; "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 74
a=0;//     const-string v6, "errorCode"
a=0;// 
a=0;//     const-string v7, "5102"
a=0;// 
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static getEncryptedContentBySSO(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;//     .locals 11
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
a=0;//     .line 86
a=0;//     const-string v8, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "CmccOmpGetEncryptedContentBySSO is calling......start"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v7, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v7}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     .line 88
a=0;//     .local v7, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v7=(Reference,Ljava/util/Hashtable;);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     const/16 v9, 0x33
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-eq v8, v9, :cond_1
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     const-string v8, "errorCode"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "5100"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8, v9}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 91
a=0;//     const-string v8, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "errorCode:5100; input plaincontent error!   length:  "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 139
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v10=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 95
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Integer);v9=(PosByte);v10=(Uninit);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 96
a=0;//     .local v1, "ENCCONTENT":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p5, :cond_2
a=0;// 
a=0;//     invoke-virtual/range {p5 .. p5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     const/16 v9, 0x21
a=0;// 
a=0;//     if-eq v8, v9, :cond_3
a=0;// 
a=0;//     .line 97
a=0;//     :cond_2
a=0;//     const-string v8, "errorCode"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "5100"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8, v9}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 98
a=0;//     const-string v8, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     const-string v9, "errorCode:5100; input enccontent error!"
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 102
a=0;//     :cond_3
a=0;//     #v8=(Integer);v9=(PosByte);
a=0;//     move-object/from16 v1, p5
a=0;// 
a=0;//     .line 104
a=0;//     const-string v8, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "enccontent length is :"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->initSharedPreferences(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 109
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpUtility;->InitUnZip(Landroid/content/Context;)I
a=0;// 
a=0;//     .line 110
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getSMSCounter()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 113
a=0;//     .local v3, "counter":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_4
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-lt v8, v9, :cond_6
a=0;// 
a=0;//     .line 117
a=0;//     :cond_4
a=0;//     #v9=(Conflicted);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p6
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 118
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 117
a=0;//     invoke-static {p0, v3, v8, v1, v9}, Lcom/cmcc/omp/security/CmccOmpUtility;->getEncryptedInfo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 120
a=0;//     .local v5, "encryptedInfo":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     .line 121
a=0;//     :cond_5
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "errorCode"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "5107"
a=0;// 
a=0;//     invoke-virtual {v7, v8, v9}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 122
a=0;//     const-string v8, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     const-string v9, "encryptedInfo is error"
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     .end local v5    # "encryptedInfo":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v5=(Uninit);v8=(Integer);v9=(PosByte);v10=(Integer);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "0"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 126
a=0;//     .restart local v5    # "encryptedInfo":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     #v0=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v8=(Integer);v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p6
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 127
a=0;//     .local v6, "newEncryptedInfo":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "\u52a0\u5bc6\u540e"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "----\u957f\u5ea6\u4e3a\uff1a"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 131
a=0;//     :try_start_0
a=0;//     const-string v8, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 137
a=0;//     .local v2, "cipherContent":[B
a=0;//     #v2=(Reference,[B);
a=0;//     const-string v8, "errorCode"
a=0;// 
a=0;//     const-string v9, "0"
a=0;// 
a=0;//     invoke-virtual {v7, v8, v9}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 138
a=0;//     const-string v8, "encryptedContent"
a=0;// 
a=0;//     invoke-virtual {v7, v8, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 132
a=0;//     .end local v2    # "cipherContent":[B
a=0;//     :catch_0
a=0;//     #v2=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 133
a=0;//     .local v4, "e":Ljava/lang/Exception;
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v8, "CmccOmpGetEncryptedContentBySSO"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "ERROR MESSAGE is:5102; "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 134
a=0;//     const-string v8, "errorCode"
a=0;// 
a=0;//     const-string v9, "5102"
a=0;// 
a=0;//     invoke-virtual {v7, v8, v9}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
