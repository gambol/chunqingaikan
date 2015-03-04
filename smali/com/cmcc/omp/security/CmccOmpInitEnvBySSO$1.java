package com.cmcc.omp.security; class CmccOmpInitEnvBySSO$1 { void a() { int a;
a=0;// .class Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CmccOmpInitEnvBySSO.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->ssoDeviceRegister(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic val$appid:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$channelId:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic val$pid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$appid:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$pid:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$channelId:Ljava/lang/String;
a=0;// 
a=0;//     .line 68
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 21
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v13
a=0;// 
a=0;//     .line 73
a=0;//     .local v13, "total_mac1":J
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     const-string v17, "OmpInitEnvBySSO"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     const-string v18, "start getApkMac..."
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 74
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 75
a=0;//     .local v1, "t1_mac1":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-string v17, "OMSSEXECTIME"
a=0;// 
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "OmpInitEnvBySSOGetAPKMac start time = "
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$appid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$pid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$channelId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getCounter()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     sget-object v19, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v20, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v17 .. v20}, Lcom/cmcc/omp/security/CmccOmpUtility;->GetAPKMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 77
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 78
a=0;//     .local v3, "t1_mac2":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-string v17, "OMSSEXECTIME"
a=0;// 
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "OmpInitEnvBySSOGetAPKMac end time = "
a=0;// 
a=0;//     invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 79
a=0;//     const-string v17, "OmpInitEnvBySSO"
a=0;// 
a=0;//     const-string v18, "start getDexMac..."
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 81
a=0;//     .local v5, "t2_mac1":J
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-string v17, "OMSSEXECTIME"
a=0;// 
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "OmpInitEnvBySSOgetDexMac start time = "
a=0;// 
a=0;//     invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 82
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$appid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$pid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$channelId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getCounter()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     sget-object v19, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v20, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static/range {v17 .. v20}, Lcom/cmcc/omp/security/CmccOmpUtility;->GetDEXMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 84
a=0;//     .local v7, "t2_mac2":J
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-string v17, "OMSSEXECTIME"
a=0;// 
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "OmpInitEnvBySSOgetDexMac end time = "
a=0;// 
a=0;//     invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 85
a=0;//     const-string v17, "OmpInitEnvBySSO"
a=0;// 
a=0;//     const-string v18, "start getCerMac..."
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 86
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     .line 87
a=0;//     .local v9, "t3_mac1":J
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     const-string v17, "OMSSEXECTIME"
a=0;// 
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "OmpInitEnvBySSOgetCerMac start time = "
a=0;// 
a=0;//     invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$appid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$pid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO$1;->val$channelId:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getCounter()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     sget-object v19, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v20, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static/range {v17 .. v20}, Lcom/cmcc/omp/security/CmccOmpUtility;->GetCERMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     .line 89
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     .line 90
a=0;//     .local v11, "t3_mac2":J
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const-string v17, "OMSSEXECTIME"
a=0;// 
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "OmpInitEnvBySSOgetCerMac end time = "
a=0;// 
a=0;//     invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 91
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v15
a=0;// 
a=0;//     .line 92
a=0;//     .local v15, "total_mac2":J
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     const-string v17, "OmpInitEnvBySSO"
a=0;// 
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "total time for calculating three macs = "
a=0;// 
a=0;//     invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sub-long v19, v15, v13
a=0;// 
a=0;//     #v19=(LongLo);v20=(LongHi);
a=0;//     invoke-virtual/range {v18 .. v20}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
}}
