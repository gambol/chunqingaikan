package com.cmcc.omp.security; class CmccOmpSharedPreferences { void a() { int a;
a=0;// .class public Lcom/cmcc/omp/security/CmccOmpSharedPreferences;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CmccOmpSharedPreferences.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static SEED_STR:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "CmccompSharedPreferences"
a=0;// 
a=0;// .field private static counter:I = 0x0
a=0;// 
a=0;// .field private static final counterKey:Ljava/lang/String; = "COUNTER"
a=0;// 
a=0;// .field private static final deviceId:Ljava/lang/String; = "deviceid"
a=0;// 
a=0;// .field private static final deviceRegistered:Ljava/lang/String; = "deviceRegistered"
a=0;// 
a=0;// .field private static final deviceSupport:Ljava/lang/String; = "devicesupport"
a=0;// 
a=0;// .field private static fileurl_c:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static final initState:Ljava/lang/String; = "initState"
a=0;// 
a=0;// .field private static final pidKey:Ljava/lang/String; = "PID"
a=0;// 
a=0;// .field private static saveEditor:Landroid/content/SharedPreferences$Editor; = null
a=0;// 
a=0;// .field private static saveInfo:Landroid/content/SharedPreferences; = null
a=0;// 
a=0;// .field private static shareContext:Landroid/content/Context; = null
a=0;// 
a=0;// .field private static smscounter:I = 0x0
a=0;// 
a=0;// .field private static final smscounterKey:Ljava/lang/String; = "SMSCOUNTER"
a=0;// 
a=0;// .field private static final timestampKey:Ljava/lang/String; = "TIME_STAMP"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "/data/data/"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/seed.reinforce"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->fileurl_c:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->SEED_STR:Ljava/lang/String;
a=0;// 
a=0;//     .line 192
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->counter:I
a=0;// 
a=0;//     .line 197
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sput v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->smscounter:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 11
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/cmcc/omp/security/CmccOmpSharedPreferences;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addCounter(II)V
a=0;//     .locals 1
a=0;//     .param p0, "counter"    # I
a=0;//     .param p1, "key"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 264
a=0;//     #v0=(Byte);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 282
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 266
a=0;//     :pswitch_0
a=0;//     if-gt p0, v0, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getSMSCounterOver()I
a=0;// 
a=0;//     move-result p0
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->setSMSCounter(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 273
a=0;//     :pswitch_1
a=0;//     if-gt p0, v0, :cond_1
a=0;// 
a=0;//     .line 275
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getCounterOver()I
a=0;// 
a=0;//     move-result p0
a=0;// 
a=0;//     .line 277
a=0;//     :cond_1
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->setCounter(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 264
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static clearAllData()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static declared-synchronized getCounter()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     const-class v1, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getCounterOver()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->counter:I
a=0;// 
a=0;//     .line 247
a=0;//     sget v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->counter:I
a=0;// 
a=0;//     const v2, 0x55d4a7f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 248
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0, v2}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->addCounter(II)V
a=0;// 
a=0;//     .line 249
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getCounterOver()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 254
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 251
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);
a=0;//     const-string v0, "CmccompSharedPreferences"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getCounter file counter = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget v3, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->counter:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 252
a=0;//     sget v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->counter:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     sput v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->counter:I
a=0;// 
a=0;//     .line 253
a=0;//     sget v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->counter:I
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0, v2}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->addCounter(II)V
a=0;// 
a=0;//     .line 254
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget v2, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->counter:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 246
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static getCounterOver()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 102
a=0;//     #v2=(Null);
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->shareContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "cmcc_omp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "COUNTER"
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected static getDeviceReg()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "deviceRegistered"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected static getDeviceSupport()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "devicesupport"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "1000"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static getDeviceid()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "deviceid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static getInitState()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 162
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     sget-object v1, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     const-string v2, "initState"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static getPid()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     const-string v1, ""
a=0;// 
a=0;//     .line 61
a=0;//     .local v1, "tempPid":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lcom/cmcc/omp/security/CmccOmpUtility;->curConfUrlField:Lcom/cmcc/omp/util/ConfUrlField;
a=0;// 
a=0;//     #v2=(Reference,Lcom/cmcc/omp/util/ConfUrlField;);
a=0;//     invoke-virtual {v2}, Lcom/cmcc/omp/util/ConfUrlField;->getTestMode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 64
a=0;//     const-string v1, "12345678901234567890123456789012"
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 68
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Boolean);v4=(Uninit);
a=0;//     sget-object v2, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/SharedPreferences;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     sget-object v2, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     const-string v3, "PID"
a=0;// 
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 75
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 76
a=0;//     const-string v2, "CmccompSharedPreferences"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "getPid exception ...= "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static declared-synchronized getSMSCounter()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     const-class v1, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getSMSCounterOver()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->smscounter:I
a=0;// 
a=0;//     .line 212
a=0;//     sget v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->smscounter:I
a=0;// 
a=0;//     const/16 v2, 0x26ac
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     sget v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->smscounter:I
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gt v0, v2, :cond_1
a=0;// 
a=0;//     .line 213
a=0;//     :cond_0
a=0;//     #v2=(Short);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v2}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->addCounter(II)V
a=0;// 
a=0;//     .line 214
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getSMSCounterOver()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 216
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v2=(Byte);v3=(Uninit);
a=0;//     const-string v0, "CmccompSharedPreferences"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getsmsCounter file smscounter = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget v3, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->smscounter:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 217
a=0;//     sget v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->smscounter:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     sput v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->smscounter:I
a=0;// 
a=0;//     .line 218
a=0;//     sget v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->smscounter:I
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v2}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->addCounter(II)V
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget v2, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->smscounter:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static getSMSCounterOver()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->shareContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "cmcc_omp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "SMSCOUNTER"
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected static declared-synchronized getSeed()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 343
a=0;//     const-class v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v0
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v1, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->SEED_STR:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method protected static declared-synchronized getSeedLength()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     const-class v2, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 321
a=0;//     .local v0, "len":I
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcom/cmcc/omp/security/CmccOmpUtility;->curConfUrlField:Lcom/cmcc/omp/util/ConfUrlField;
a=0;// 
a=0;//     #v1=(Reference,Lcom/cmcc/omp/util/ConfUrlField;);
a=0;//     invoke-virtual {v1}, Lcom/cmcc/omp/util/ConfUrlField;->getTestMode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 324
a=0;//     const-string v1, "12345678901234567890123456789012345678901234"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sput-object v1, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->SEED_STR:Ljava/lang/String;
a=0;// 
a=0;//     .line 325
a=0;//     sget-object v1, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->SEED_STR:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 333
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 329
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Null);v1=(Boolean);v4=(Uninit);
a=0;//     sget-object v1, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/cmcc/omp/security/CmccOmpUtility;->getSeed(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 330
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "CmccompSharedPreferences"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "current seed len is : "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 331
a=0;//     const-string v1, ""
a=0;// 
a=0;//     sput-object v1, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->SEED_STR:Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 320
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method protected static getTimestamp()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "TIME_STAMP"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static initSeedSave()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 291
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v3, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->fileurl_c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 292
a=0;//     .local v2, "file_c":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 296
a=0;//     :try_start_0
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 303
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 311
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 297
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 299
a=0;//     .local v1, "e1":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 305
a=0;//     .end local v1    # "e1":Ljava/lang/Exception;
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 307
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static initSharedPreferences(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     sput-object p0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->shareContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 51
a=0;//     const-string v0, "cmcc_omp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     .line 52
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveInfo:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 53
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "/data/data/"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/seed.reinforce"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->fileurl_c:Ljava/lang/String;
a=0;// 
a=0;//     .line 55
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->initSeedSave()V
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static setCounter(I)V
a=0;//     .locals 2
a=0;//     .param p0, "counter"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "COUNTER"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 115
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static setDeviceReg(Z)V
a=0;//     .locals 3
a=0;//     .param p0, "deviceReg"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "deviceRegistered"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 156
a=0;//     const-string v0, "CmccompSharedPreferences"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "saveEditor , deviceRegistered = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 157
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static setDeviceSupport(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "devicesupport"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "devicesupport"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 144
a=0;//     const-string v0, "CmccompSharedPreferences"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "saveEditor , devicesupport = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 145
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static setDeviceid(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "deviceid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "deviceid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 96
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 97
a=0;//     const-string v0, "CmccompSharedPreferences"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "save editor deviceid  length : "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
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
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static setInitState(Z)V
a=0;//     .locals 2
a=0;//     .param p0, "isInit"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "initState"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 170
a=0;//     const-string v0, "CmccompSharedPreferences"
a=0;// 
a=0;//     const-string v1, "saveEditor , initState = initState"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 171
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 172
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static setPid(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "pid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "PID"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 84
a=0;//     const-string v0, "CmccompSharedPreferences"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " setPid start! pid length = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
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
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 85
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static setSMSCounter(I)V
a=0;//     .locals 2
a=0;//     .param p0, "counter"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "SMSCOUNTER"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 121
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static setTimestamp(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "timestamp"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v1, "TIME_STAMP"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 132
a=0;//     const-string v0, "CmccompSharedPreferences"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "saveEditor , timestamp = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 133
a=0;//     sget-object v0, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->saveEditor:Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// .end method
}}
