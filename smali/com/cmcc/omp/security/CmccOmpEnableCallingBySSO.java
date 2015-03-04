package com.cmcc.omp.security; class CmccOmpEnableCallingBySSO { void a() { int a;
a=0;// .class public Lcom/cmcc/omp/security/CmccOmpEnableCallingBySSO;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CmccOmpEnableCallingBySSO.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "EnableCallingBySSO"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/cmcc/omp/security/CmccOmpEnableCallingBySSO;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static enablerCallingBase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;[BLjava/lang/String;)Ljava/util/Hashtable;
a=0;//     .locals 15
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;//     .param p2, "method"    # Ljava/lang/String;
a=0;//     .param p4, "httpbody"    # [B
a=0;//     .param p5, "Authorization"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;[B",
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
a=0;//     .line 100
a=0;//     .local p3, "httphead":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     const-string v7, ""
a=0;// 
a=0;//     .line 101
a=0;//     .local v7, "httpbodyString":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v9}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     .line 103
a=0;//     .local v9, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v9=(Reference,Ljava/util/Hashtable;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-gtz v11, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     #v11=(Conflicted);
a=0;//     const-string v11, "errorCode"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v12, "5100"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v10, v9
a=0;// 
a=0;//     .line 210
a=0;//     .end local v9    # "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .local v10, "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v10=(Reference,Ljava/util/Hashtable;);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-object v10
a=0;// 
a=0;//     .line 108
a=0;//     .end local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .restart local v9    # "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Integer);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     sput-wide v11, Lcom/cmcc/omp/security/CmccOmpUtility;->t3:J
a=0;// 
a=0;//     .line 109
a=0;//     const-string v11, "OMSSEXECTIME"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "COMUNICATE_TIME: start time = "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v13, Lcom/cmcc/omp/security/CmccOmpUtility;->t3:J
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     invoke-virtual {v12, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 110
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     .line 112
a=0;//     invoke-static/range {p4 .. p4}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 113
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "httpbodyString : "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, " length : "
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 116
a=0;//     :cond_2
a=0;//     #v13=(Conflicted);
a=0;//     invoke-static {v9}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkConnect(Ljava/util/Hashtable;)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 117
a=0;//     const-string v11, "errorCode"
a=0;// 
a=0;//     invoke-virtual {v9, v11}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_3
a=0;// 
a=0;//     move-object v10, v9
a=0;// 
a=0;//     .line 118
a=0;//     .restart local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v10=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     .end local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_3
a=0;//     #v10=(Uninit);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     .line 120
a=0;//     .local v3, "code":I
a=0;//     #v3=(Byte);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     .line 125
a=0;//     .local v8, "statuscode":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "Enable Calling url = "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 126
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpEnableCallingBySSO;->getHttpURLCon(Ljava/lang/String;)Ljava/net/HttpURLConnection;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 134
a=0;//     .local v6, "httpUrlConnection":Ljava/net/HttpURLConnection;
a=0;//     #v6=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     move-object/from16 v1, p5
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v0, v1}, Lcom/cmcc/omp/security/CmccOmpUtility;->setHttpUrlConnReqProperty(Ljava/net/HttpURLConnection;Ljava/util/Hashtable;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     :try_start_1
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "method = "
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 138
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 146
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-static {v6, v0}, Lcom/cmcc/omp/security/CmccOmpUtility;->setHttpUrlConnOutput(Ljava/net/HttpURLConnection;[B)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_4
a=0;// 
a=0;//     .line 147
a=0;//     const-string v11, "errorCode"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v12, "5151"
a=0;// 
a=0;//     invoke-virtual {v9, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v10, v9
a=0;// 
a=0;//     .line 148
a=0;//     .restart local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v10=(Reference,Ljava/util/Hashtable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     .end local v6    # "httpUrlConnection":Ljava/net/HttpURLConnection;
a=0;//     .end local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v6=(Uninit);v10=(Uninit);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 130
a=0;//     .local v4, "e":Ljava/io/IOException;
a=0;//     #v4=(Reference,Ljava/io/IOException;);
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "net timeout...errorcode=5151OMSSException ="
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 131
a=0;//     const-string v11, "errorCode"
a=0;// 
a=0;//     const-string v12, "5151"
a=0;// 
a=0;//     invoke-virtual {v9, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v10, v9
a=0;// 
a=0;//     .line 132
a=0;//     .restart local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v10=(Reference,Ljava/util/Hashtable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 140
a=0;//     .end local v4    # "e":Ljava/io/IOException;
a=0;//     .end local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .restart local v6    # "httpUrlConnection":Ljava/net/HttpURLConnection;
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Reference,Ljava/lang/String;);v4=(Uninit);v6=(Reference,Ljava/net/HttpURLConnection;);v10=(Uninit);v12=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 142
a=0;//     .restart local v4    # "e":Ljava/io/IOException;
a=0;//     #v4=(Reference,Ljava/io/IOException;);
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "net timeout...errorcode=5151OMSSException ="
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 143
a=0;//     const-string v11, "errorCode"
a=0;// 
a=0;//     const-string v12, "5151"
a=0;// 
a=0;//     invoke-virtual {v9, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v10, v9
a=0;// 
a=0;//     .line 144
a=0;//     .restart local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v10=(Reference,Ljava/util/Hashtable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     .end local v4    # "e":Ljava/io/IOException;
a=0;//     .end local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_4
a=0;//     :try_start_2
a=0;//     #v4=(Uninit);v10=(Uninit);v11=(Boolean);
a=0;//     invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 153
a=0;//     #v3=(Integer);
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "getResponseCode = "
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     .line 161
a=0;//     const-string v11, "statuscode"
a=0;// 
a=0;//     invoke-virtual {v6, v11}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 162
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "statuscode = "
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 163
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     .line 165
a=0;//     const-string v11, "errorCode"
a=0;// 
a=0;//     const-string v12, "5101"
a=0;// 
a=0;//     invoke-virtual {v9, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v10, v9
a=0;// 
a=0;//     .line 166
a=0;//     .restart local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v10=(Reference,Ljava/util/Hashtable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 155
a=0;//     .end local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :catch_2
a=0;//     #v10=(Uninit);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 157
a=0;//     .restart local v4    # "e":Ljava/io/IOException;
a=0;//     #v4=(Reference,Ljava/io/IOException;);
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "net timeout...errorcode=5151OMSSException ="
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 158
a=0;//     const-string v11, "errorCode"
a=0;// 
a=0;//     const-string v12, "5151"
a=0;// 
a=0;//     invoke-virtual {v9, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v10, v9
a=0;// 
a=0;//     .line 159
a=0;//     .restart local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v10=(Reference,Ljava/util/Hashtable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     .end local v4    # "e":Ljava/io/IOException;
a=0;//     .end local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_5
a=0;//     #v4=(Uninit);v10=(Uninit);
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     const-string v12, "EnableCalling request..."
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 170
a=0;//     sget-object v11, Lcom/cmcc/omp/security/CmccOmpUtility;->curConfUrlField:Lcom/cmcc/omp/util/ConfUrlField;
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/cmcc/omp/util/ConfUrlField;->getTestMode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, "0"
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_8
a=0;// 
a=0;//     .line 173
a=0;//     const-string v11, "0"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_8
a=0;// 
a=0;//     const-string v11, "OK"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_8
a=0;// 
a=0;//     .line 175
a=0;//     const-string v11, "8603"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_6
a=0;// 
a=0;//     const-string v11, "8609"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_7
a=0;// 
a=0;//     .line 176
a=0;//     :cond_6
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->clearAllData()V
a=0;// 
a=0;//     .line 177
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "statuscode = "
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const-string v13, ", deviceid or seed is invalid at all."
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 179
a=0;//     :cond_7
a=0;//     #v11=(Conflicted);
a=0;//     const-string v11, "errorCode"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v11, v8}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v10, v9
a=0;// 
a=0;//     .line 180
a=0;//     .restart local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v10=(Reference,Ljava/util/Hashtable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     .end local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_8
a=0;//     #v10=(Uninit);v11=(Boolean);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 189
a=0;//     .local v2, "bodySize":I
a=0;//     :try_start_3
a=0;//     #v2=(Null);
a=0;//     const-string v11, "Content-Length"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v11}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 190
a=0;//     .local v5, "headlength":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 191
a=0;//     #v2=(Integer);
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "!bodySize = "
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     .line 197
a=0;//     .end local v5    # "headlength":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-static {v6, v9, v3, v8}, Lcom/cmcc/omp/security/CmccOmpUtility;->parseHttpUrlConnResp(Ljava/net/HttpURLConnection;Ljava/util/Hashtable;ILjava/lang/String;)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 198
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "code = "
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 199
a=0;//     const-string v11, "EnableCallingBySSO"
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "statuscode = "
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 200
a=0;//     const-string v11, ""
a=0;// 
a=0;//     invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_9
a=0;// 
a=0;//     .line 202
a=0;//     const-string v11, "errorCode"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v11, v8}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 206
a=0;//     :cond_9
a=0;//     #v11=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     sput-wide v11, Lcom/cmcc/omp/security/CmccOmpUtility;->t4:J
a=0;// 
a=0;//     .line 207
a=0;//     const-string v11, "OMSSEXECTIME"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "EnableCallingBySSOCOMUNICATE_TIME: end time = "
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v13, Lcom/cmcc/omp/security/CmccOmpUtility;->t4:J
a=0;// 
a=0;//     #v13=(LongLo);
a=0;//     invoke-virtual {v12, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 208
a=0;//     sget-wide v11, Lcom/cmcc/omp/security/CmccOmpUtility;->t4:J
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     sget-wide v13, Lcom/cmcc/omp/security/CmccOmpUtility;->t3:J
a=0;// 
a=0;//     sub-long/2addr v11, v13
a=0;// 
a=0;//     sput-wide v11, Lcom/cmcc/omp/security/CmccOmpUtility;->t6:J
a=0;// 
a=0;//     .line 209
a=0;//     const-string v11, "OMSSEXECTIME"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "EnableCallingBySSOCOMUNICATE_TIME: consuming time = "
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v13, Lcom/cmcc/omp/security/CmccOmpUtility;->t6:J
a=0;// 
a=0;//     #v13=(LongLo);
a=0;//     invoke-virtual {v12, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v10, v9
a=0;// 
a=0;//     .line 210
a=0;//     .restart local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v10=(Reference,Ljava/util/Hashtable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     .end local v10    # "th":Ljava/lang/Object;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :catch_3
a=0;//     #v4=(Uninit);v10=(Uninit);v11=(Conflicted);v12=(Conflicted);v13=(Reference,Ljava/lang/String;);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 195
a=0;//     .local v4, "e":Ljava/lang/NullPointerException;
a=0;//     #v4=(Reference,Ljava/lang/NullPointerException;);
a=0;//     invoke-virtual {v4}, Ljava/lang/NullPointerException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static enablerCallingBySSO(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;[B)Ljava/util/Hashtable;
a=0;//     .locals 23
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
a=0;//     .line 19
a=0;//     .local p5, "httphead":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     const-string v4, "EnableCallingBySSO"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "enablerCallingBySSO is Calling"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 20
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sput-wide v4, Lcom/cmcc/omp/security/CmccOmpUtility;->t1:J
a=0;// 
a=0;//     .line 21
a=0;//     const-string v4, "OMSSEXECTIME"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "EnableCallingBySSO: start time = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v6, Lcom/cmcc/omp/security/CmccOmpUtility;->t1:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 22
a=0;//     new-instance v19, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v19=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct/range {v19 .. v19}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     .line 23
a=0;//     .local v19, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v19=(Reference,Ljava/util/Hashtable;);
a=0;//     const-string v4, "EnableCallingBySSO"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "CmccOmpUtility.init_Url is "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v6, Lcom/cmcc/omp/security/CmccOmpUtility;->init_Url:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 24
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->init_Url:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v4, v1, v2, v3}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkInitCondition(Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 25
a=0;//     const-string v4, "errorCode"
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     move-object/from16 v15, v19
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Reference,Ljava/util/Hashtable;);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     return-object v15
a=0;// 
a=0;//     .line 28
a=0;//     :cond_0
a=0;//     #v4=(Boolean);v6=(Reference,Ljava/lang/String;);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getCounter()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 29
a=0;//     .local v13, "counter":Ljava/lang/String;
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v5, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v13, v4, v5}, Lcom/cmcc/omp/security/CmccOmpUtility;->getToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .line 31
a=0;//     .local v21, "token":Ljava/lang/String;
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 32
a=0;//     .local v11, "GenPara":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v5, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v11, v13, v4, v5}, Lcom/cmcc/omp/security/CmccOmpUtility;->GetAPKMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 33
a=0;//     .local v12, "apkMacString":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v5, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v11, v13, v4, v5}, Lcom/cmcc/omp/security/CmccOmpUtility;->GetDEXMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 34
a=0;//     .local v14, "dexMacString":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v5, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v11, v13, v4, v5}, Lcom/cmcc/omp/security/CmccOmpUtility;->GetCERMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 37
a=0;//     .local v10, "CERMacString":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpUtility;->gettimestamp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 38
a=0;//     .local v20, "timestamp":Ljava/lang/String;
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkToken(Ljava/util/Hashtable;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 39
a=0;//     const-string v4, "errorCode"
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     move-object/from16 v15, v19
a=0;// 
a=0;//     .line 40
a=0;//     #v15=(Reference,Ljava/util/Hashtable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 42
a=0;//     :cond_1
a=0;//     #v15=(Uninit);
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getDeviceid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 43
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 42
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-static {v0, v4, v5}, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->getEncryptedDeviceid(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 45
a=0;//     .local v16, "encrypteddeviceid":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->curConfUrlField:Lcom/cmcc/omp/util/ConfUrlField;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/cmcc/omp/util/ConfUrlField;->getSdkVersion()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 46
a=0;//     .local v17, "sdkversion":Ljava/lang/String;
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     const-string v18, ""
a=0;// 
a=0;//     .line 47
a=0;//     .local v18, "sidSignature":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     const-string v22, ""
a=0;// 
a=0;//     .line 49
a=0;//     .local v22, "ttokenString":Ljava/lang/String;
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 51
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, p5
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkSidSignature(Ljava/util/Hashtable;Ljava/util/Hashtable;)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 52
a=0;//     const-string v4, "errorCode"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 53
a=0;//     const-string v4, "sidSignature"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 54
a=0;//     const-string v5, "EnableCallingBySSO"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sidSignature = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sidSignature"
a=0;// 
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     :goto_1
a=0;//     move-object/from16 v15, v19
a=0;// 
a=0;//     .line 58
a=0;//     #v15=(Reference,Ljava/util/Hashtable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_2
a=0;//     #v4=(Boolean);v15=(Uninit);
a=0;//     const-string v4, "EnableCallingBySSO"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "sidSignature = "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 60
a=0;//     :cond_3
a=0;//     #v4=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "sidSignature"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .end local v18    # "sidSignature":Ljava/lang/String;
a=0;//     check-cast v18, Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     .restart local v18    # "sidSignature":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "OMPAUTH realm=\"OMP\",appid=\""
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 77
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 78
a=0;//     const-string v5, ",pid="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 79
a=0;//     const-string v5, ",channelid="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 80
a=0;//     const-string v5, ",encrypteddeviceid="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 81
a=0;//     const-string v5, ",devicetoken="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 82
a=0;//     const-string v5, ",ttoken="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 83
a=0;//     const-string v5, ",keystoremac="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 84
a=0;//     const-string v5, ",dexsignmac="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 85
a=0;//     const-string v5, ",apksignmac="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 86
a=0;//     const-string v5, ",counter="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 87
a=0;//     const-string v5, ",sdkversion="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 88
a=0;//     const-string v5, ",sidSignature="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\""
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .local v9, "Authorization":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v4, p0
a=0;// 
a=0;//     move-object/from16 v5, p1
a=0;// 
a=0;//     move-object/from16 v6, p4
a=0;// 
a=0;//     move-object/from16 v7, p5
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Hashtable;);
a=0;//     move-object/from16 v8, p6
a=0;// 
a=0;//     .line 89
a=0;//     #v8=(Reference,[B);
a=0;//     invoke-static/range {v4 .. v9}, Lcom/cmcc/omp/security/CmccOmpEnableCallingBySSO;->enablerCallingBase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;[BLjava/lang/String;)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 90
a=0;//     .local v15, "enableHashtable":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     #v15=(Reference,Ljava/util/Hashtable;);
a=0;//     const-string v4, "EnableCallingBySSO_001"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "counter = "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sput-wide v4, Lcom/cmcc/omp/security/CmccOmpUtility;->t2:J
a=0;// 
a=0;//     .line 92
a=0;//     const-string v4, "OMSSEXECTIME"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "EnableCallingBySSO: end time = "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v6, Lcom/cmcc/omp/security/CmccOmpUtility;->t2:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 93
a=0;//     sget-wide v4, Lcom/cmcc/omp/security/CmccOmpUtility;->t2:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sget-wide v6, Lcom/cmcc/omp/security/CmccOmpUtility;->t1:J
a=0;// 
a=0;//     sub-long/2addr v4, v6
a=0;// 
a=0;//     sput-wide v4, Lcom/cmcc/omp/security/CmccOmpUtility;->t5:J
a=0;// 
a=0;//     .line 94
a=0;//     const-string v4, "OMSSEXECTIME"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "EnableCallingBySSO: consuming time = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v6, Lcom/cmcc/omp/security/CmccOmpUtility;->t5:J
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 61
a=0;//     .end local v9    # "Authorization":Ljava/lang/String;
a=0;//     .end local v15    # "enableHashtable":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     :cond_5
a=0;//     #v4=(Boolean);v6=(Reference,Ljava/lang/String;);v8=(Uninit);v9=(Uninit);v15=(Uninit);
a=0;//     const-string v4, "2"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 62
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, p5
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkTToken(Ljava/util/Hashtable;Ljava/util/Hashtable;)Ljava/util/Hashtable;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 63
a=0;//     const-string v4, "errorCode"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     .line 64
a=0;//     const-string v4, "ttoken"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 65
a=0;//     const-string v5, "EnableCallingBySSO"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ttoken = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ttoken"
a=0;// 
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     :goto_3
a=0;//     move-object/from16 v15, v19
a=0;// 
a=0;//     .line 69
a=0;//     #v15=(Reference,Ljava/util/Hashtable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_6
a=0;//     #v4=(Boolean);v15=(Uninit);
a=0;//     const-string v4, "EnableCallingBySSO"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "ttoken = "
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 71
a=0;//     :cond_7
a=0;//     #v4=(Boolean);v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "ttoken"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .end local v22    # "ttokenString":Ljava/lang/String;
a=0;//     check-cast v22, Ljava/lang/String;
a=0;// 
a=0;//     .restart local v22    # "ttokenString":Ljava/lang/String;
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected static getHttpURLCon(Ljava/lang/String;)Ljava/net/HttpURLConnection;
a=0;//     .locals 5
a=0;//     .param p0, "urlString"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const v4, 0x15f90
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 216
a=0;//     #v3=(One);
a=0;//     new-instance v1, Ljava/net/URL;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 217
a=0;//     .local v1, "url":Ljava/net/URL;
a=0;//     #v1=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "urlConnection":Ljava/net/URLConnection;
a=0;//     #v2=(Reference,Ljava/net/URLConnection;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 218
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 219
a=0;//     .local v0, "httpUrlConnection":Ljava/net/HttpURLConnection;
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 220
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {v0, v4}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 222
a=0;//     invoke-virtual {v0, v4}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 223
a=0;//     const-string v3, "GET"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 224
a=0;//     return-object v0
a=0;// .end method
}}
