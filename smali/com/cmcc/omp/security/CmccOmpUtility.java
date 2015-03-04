package com.cmcc.omp.security; class CmccOmpUtility { void a() { int a;
a=0;// .class public Lcom/cmcc/omp/security/CmccOmpUtility;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CmccOmpUtility.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final COMUNICATE_TIME:Ljava/lang/String; = "COMUNICATE_TIME"
a=0;// 
a=0;// .field public static final C_EXECTIME:Ljava/lang/String; = "C_EXECTIME"
a=0;// 
a=0;// .field private static IS_CHANGE_MANUAL:Z = false
a=0;// 
a=0;// .field protected static IS_CMWAP:Z = false
a=0;// 
a=0;// .field private static IS_SETTING_APN:Z = false
a=0;// 
a=0;// .field protected static IS_SIMULATOR:Z = false
a=0;// 
a=0;// .field private static IS_TEST_APN:Z = false
a=0;// 
a=0;// .field protected static Install_apk_path:Ljava/lang/String; = null
a=0;// 
a=0;// .field public static final OMSSEXECTIME:Ljava/lang/String; = "OMSSEXECTIME"
a=0;// 
a=0;// .field private static SEED_STR:Ljava/lang/String; = null
a=0;// 
a=0;// .field public static final TAG:Ljava/lang/String; = "CmccOmpUtility"
a=0;// 
a=0;// .field private static cmwapApn:Ljava/lang/String; = null
a=0;// 
a=0;// .field protected static cmwapApnPort:I = 0x0
a=0;// 
a=0;// .field protected static confXMLFieldList:Ljava/util/List; = null
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/cmcc/omp/util/ConfUrlField;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected static curConfUrlField:Lcom/cmcc/omp/util/ConfUrlField; = null
a=0;// 
a=0;// .field public static final errorCode:Ljava/lang/String; = "errorCode"
a=0;// 
a=0;// .field private static headlist:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field protected static init_Url:Ljava/lang/String;
a=0;// 
a=0;// .field private static isVerifyHmac:Ljava/lang/String;
a=0;// 
a=0;// .field protected static packageName:Ljava/lang/String;
a=0;// 
a=0;// .field protected static path:Ljava/lang/String;
a=0;// 
a=0;// .field public static t1:J
a=0;// 
a=0;// .field public static t2:J
a=0;// 
a=0;// .field public static t3:J
a=0;// 
a=0;// .field public static t4:J
a=0;// 
a=0;// .field public static t5:J
a=0;// 
a=0;// .field public static t6:J
a=0;// 
a=0;// .field public static t7:J
a=0;// 
a=0;// .field private static temp:Ljava/lang/String;
a=0;// 
a=0;// .field protected static timestamp:Ljava/lang/String;
a=0;// 
a=0;// .field protected static wapApn:Ljava/lang/String;
a=0;// 
a=0;// .field protected static wapApnPort:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/cmcc/omp/security/CmccOmpUtility;->t1:J
a=0;// 
a=0;//     .line 46
a=0;//     sput-wide v0, Lcom/cmcc/omp/security/CmccOmpUtility;->t2:J
a=0;// 
a=0;//     .line 47
a=0;//     sput-wide v0, Lcom/cmcc/omp/security/CmccOmpUtility;->t3:J
a=0;// 
a=0;//     .line 48
a=0;//     sput-wide v0, Lcom/cmcc/omp/security/CmccOmpUtility;->t4:J
a=0;// 
a=0;//     .line 49
a=0;//     sput-wide v0, Lcom/cmcc/omp/security/CmccOmpUtility;->t5:J
a=0;// 
a=0;//     .line 50
a=0;//     sput-wide v0, Lcom/cmcc/omp/security/CmccOmpUtility;->t6:J
a=0;// 
a=0;//     .line 51
a=0;//     sput-wide v0, Lcom/cmcc/omp/security/CmccOmpUtility;->t7:J
a=0;// 
a=0;//     .line 53
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->temp:Ljava/lang/String;
a=0;// 
a=0;//     .line 58
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->isVerifyHmac:Ljava/lang/String;
a=0;// 
a=0;//     .line 63
a=0;//     const-string v0, "100920031464"
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->timestamp:Ljava/lang/String;
a=0;// 
a=0;//     .line 67
a=0;//     sput-boolean v2, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CMWAP:Z
a=0;// 
a=0;//     .line 72
a=0;//     const-string v0, "192.168.230.8"
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->wapApn:Ljava/lang/String;
a=0;// 
a=0;//     .line 74
a=0;//     const/16 v0, 0x2344
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lcom/cmcc/omp/security/CmccOmpUtility;->wapApnPort:I
a=0;// 
a=0;//     .line 79
a=0;//     sput-boolean v2, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_TEST_APN:Z
a=0;// 
a=0;//     .line 84
a=0;//     const-string v0, "10.0.0.172"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->cmwapApn:Ljava/lang/String;
a=0;// 
a=0;//     .line 86
a=0;//     const/16 v0, 0x50
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/cmcc/omp/security/CmccOmpUtility;->cmwapApnPort:I
a=0;// 
a=0;//     .line 91
a=0;//     sput-boolean v3, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_SETTING_APN:Z
a=0;// 
a=0;//     .line 96
a=0;//     sput-boolean v3, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CHANGE_MANUAL:Z
a=0;// 
a=0;//     .line 98
a=0;//     sput-boolean v2, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_SIMULATOR:Z
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Lcom/cmcc/omp/util/ConfUrlField;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/cmcc/omp/util/ConfUrlField;);
a=0;//     invoke-direct {v0}, Lcom/cmcc/omp/util/ConfUrlField;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/cmcc/omp/util/ConfUrlField;);
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->curConfUrlField:Lcom/cmcc/omp/util/ConfUrlField;
a=0;// 
a=0;//     .line 106
a=0;//     const-string v0, "com.cmcc.omp.security"
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 107
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->path:Ljava/lang/String;
a=0;// 
a=0;//     .line 108
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     .line 109
a=0;//     const-string v0, ""
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->init_Url:Ljava/lang/String;
a=0;// 
a=0;//     .line 988
a=0;//     const-string v0, "cmcc_rusteze"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 989
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/cmcc/omp/security/CmccOmpUtility;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static native Base64(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native GetAPKMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native GetCERMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native GetDEXMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native GetDeviceID(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native GetEncryptedContFlex(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native GetRegMac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method protected static InitUnZip(Landroid/content/Context;)I
a=0;//     .locals 5
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 122
a=0;//     #v1=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 123
a=0;//     const/16 v1, 0x13bd
a=0;// 
a=0;//     .line 145
a=0;//     .end local p0    # "ctx":Landroid/content/Context;
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(PosShort);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 124
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local p0    # "ctx":Landroid/content/Context;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sput-object v2, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "/data/data/"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "/"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/cmcc/omp/security/CmccOmpUtility;->path:Ljava/lang/String;
a=0;// 
a=0;//     .line 126
a=0;//     check-cast p0, Landroid/content/ContextWrapper;
a=0;// 
a=0;//     .end local p0    # "ctx":Landroid/content/Context;
a=0;//     invoke-virtual {p0}, Landroid/content/ContextWrapper;->getPackageResourcePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sput-object v2, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     .line 129
a=0;//     :try_start_0
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     const-string v3, "unzipFile"
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 130
a=0;//     sget-object v2, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/data/data/"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/cmcc/omp/util/XZip;->UnZipAll(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "chmod 777 "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "readme.data"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
a=0;// 
a=0;//     .line 134
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "chmod 777 "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "help.data"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
a=0;// 
a=0;//     .line 136
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     sget-object v3, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 137
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 138
a=0;//     .restart local v0    # "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "unzip bin file failed, errorCode=5206OMSSException="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 138
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 141
a=0;//     sput-boolean v1, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->INIT_STATE:Z
a=0;// 
a=0;//     .line 142
a=0;//     sget-boolean v1, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->INIT_STATE:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v1}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->setInitState(Z)V
a=0;// 
a=0;//     .line 143
a=0;//     const/16 v1, 0x1456
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static native SetRegSeed(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// .end method
a=0;// 
a=0;// .method protected static checkAppid(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p0, "appid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x13f0
a=0;// 
a=0;//     .line 863
a=0;//     #v1=(PosShort);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-le v2, v3, :cond_1
a=0;// 
a=0;//     .line 864
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "input appid is error... 5104"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 875
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 869
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Integer);v3=(PosByte);
a=0;//     invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 875
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 870
a=0;//     :catch_0
a=0;//     #v1=(PosShort);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 871
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "parse appid failed... 5104"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkAppid2(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p0, "appid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x13f0
a=0;// 
a=0;//     .line 880
a=0;//     #v1=(PosShort);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x12
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v2, v3, :cond_1
a=0;// 
a=0;//     .line 881
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "input appid is error... 5104"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 892
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 886
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Integer);v3=(PosByte);
a=0;//     invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 892
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 887
a=0;//     :catch_0
a=0;//     #v1=(PosShort);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 888
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "parse appid failed... 5104"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkChannelId(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p0, "channelId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x13f1
a=0;// 
a=0;//     .line 912
a=0;//     #v1=(PosShort);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x14
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-le v2, v3, :cond_1
a=0;// 
a=0;//     .line 913
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "input channelid is error...5105"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 922
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 917
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Integer);v3=(PosByte);
a=0;//     invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 922
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 918
a=0;//     :catch_0
a=0;//     #v1=(PosShort);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 919
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "input channelid is error...5105"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkChannelId2(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p0, "channelId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x13f1
a=0;// 
a=0;//     .line 897
a=0;//     #v1=(PosShort);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xc
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v2, v3, :cond_1
a=0;// 
a=0;//     .line 898
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "input channelid is error...5105"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 907
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 902
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v2=(Integer);v3=(PosByte);
a=0;//     invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 907
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 903
a=0;//     :catch_0
a=0;//     #v1=(PosShort);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 904
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "input channelid is error...5105"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkConnect()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 541
a=0;//     .local v1, "statuscode":I
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpUtility;->isConnect()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 542
a=0;//     .local v0, "isConnectSucceed":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 544
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "Connection is failed...5150"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 545
a=0;//     const/16 v1, 0x141e
a=0;// 
a=0;//     .line 547
a=0;//     .end local v1    # "statuscode":I
a=0;//     :cond_0
a=0;//     #v1=(PosShort);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method protected static checkConnect(Ljava/util/Hashtable;)Ljava/util/Hashtable;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 532
a=0;//     .local p0, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkConnect()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 533
a=0;//     .local v0, "status":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 534
a=0;//     const-string v1, "errorCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 536
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkCtx(Landroid/content/Context;)I
a=0;//     .locals 2
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 844
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 845
a=0;//     const-string v0, "CmccOmpUtility"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "\u672c\u5730\u521d\u59cb\u5316context\u5931\u8d25 error = 5053\uff0ccontext\u4e3anull"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 847
a=0;//     const/16 v0, 0x13bd
a=0;// 
a=0;//     .line 849
a=0;//     :goto_0
a=0;//     #v0=(PosShort);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkExData(Ljava/lang/String;)I
a=0;//     .locals 5
a=0;//     .param p0, "ExData"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v2, 0x13f4
a=0;// 
a=0;//     .line 928
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x10
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-le v3, v4, :cond_0
a=0;// 
a=0;//     .line 929
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "input ExData is error...5108"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 942
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 933
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Integer);v4=(PosByte);
a=0;//     const-string v3, "^[0-9a-zA-Z]+$"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 935
a=0;//     .local v1, "pt":Ljava/util/regex/Pattern;
a=0;//     #v1=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 936
a=0;//     .local v0, "mt":Ljava/util/regex/Matcher;
a=0;//     #v0=(Reference,Ljava/util/regex/Matcher;);
a=0;//     invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 938
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "input ExData is error...5108"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 942
a=0;//     :cond_1
a=0;//     #v3=(Boolean);v4=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkInitCondition(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;//     .param p2, "pid"    # Ljava/lang/String;
a=0;//     .param p3, "channelId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 466
a=0;//     sget-object v1, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1, p0, p1, p2, p3}, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->ssoDeviceRegister(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 468
a=0;//     .local v0, "isDeviceReg":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 469
a=0;//     const-string v1, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Device register failed, code="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 472
a=0;//     .end local v0    # "isDeviceReg":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .restart local v0    # "isDeviceReg":I
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkInitCondition(Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;//     .locals 4
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "appid"    # Ljava/lang/String;
a=0;//     .param p3, "pid"    # Ljava/lang/String;
a=0;//     .param p4, "channelId"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
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
a=0;//     .line 458
a=0;//     .local p0, "hash":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     invoke-static {p1, p2, p3, p4}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkInitCondition(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 459
a=0;//     .local v0, "statuscode":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 460
a=0;//     const-string v1, "errorCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 462
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkParameters(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "appid"    # Ljava/lang/String;
a=0;//     .param p3, "pid"    # Ljava/lang/String;
a=0;//     .param p4, "channelId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 478
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkCtx(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 479
a=0;//     .local v0, "stateCode":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 498
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 482
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkURL(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 483
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 484
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 486
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p2}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkAppid(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 487
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 488
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 490
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p3}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkPid(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 491
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 492
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 494
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     invoke-static {p4}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkChannelId(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 495
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 496
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 498
a=0;//     :cond_4
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkPid(Ljava/lang/String;)I
a=0;//     .locals 6
a=0;//     .param p0, "pid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 560
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 562
a=0;//     .local v1, "errorcode":I
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 563
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 568
a=0;//     :goto_0
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 569
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "getPid exception ...5052"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 570
a=0;//     const/16 v1, 0x13bc
a=0;// 
a=0;//     .line 571
a=0;//     #v1=(PosShort);
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "error pid : "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", len="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 583
a=0;//     .end local v1    # "errorcode":I
a=0;//     .local v2, "errorcode":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(PosShort);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 565
a=0;//     .end local v2    # "errorcode":I
a=0;//     .restart local v1    # "errorcode":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string p0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 575
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 583
a=0;//     .end local v1    # "errorcode":I
a=0;//     .restart local v2    # "errorcode":I
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 576
a=0;//     .end local v2    # "errorcode":I
a=0;//     .restart local v1    # "errorcode":I
a=0;//     :catch_0
a=0;//     #v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 578
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "getPid exception ...5052"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 579
a=0;//     const/16 v1, 0x13bc
a=0;// 
a=0;//     .line 580
a=0;//     #v1=(PosShort);
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "error pid : "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", len="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 581
a=0;//     .end local v1    # "errorcode":I
a=0;//     .restart local v2    # "errorcode":I
a=0;//     #v2=(PosShort);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static checkPid(Ljava/util/Hashtable;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;//     .locals 4
a=0;//     .param p1, "pid"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
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
a=0;//     .line 552
a=0;//     .local p0, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     invoke-static {p1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkPid(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 553
a=0;//     .local v0, "status":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 554
a=0;//     const-string v1, "errorCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 556
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkPid2(Ljava/lang/String;)I
a=0;//     .locals 6
a=0;//     .param p0, "pid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 588
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 590
a=0;//     .local v1, "errorcode":I
a=0;//     #v1=(Null);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 591
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 596
a=0;//     :goto_0
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq v3, v4, :cond_2
a=0;// 
a=0;//     .line 597
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "getPid exception ...5052"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 598
a=0;//     const/16 v1, 0x13bc
a=0;// 
a=0;//     .line 599
a=0;//     #v1=(PosShort);
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "error pid : "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", len="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 611
a=0;//     .end local v1    # "errorcode":I
a=0;//     .local v2, "errorcode":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(PosShort);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 593
a=0;//     .end local v2    # "errorcode":I
a=0;//     .restart local v1    # "errorcode":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string p0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 603
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v3=(Integer);v4=(PosByte);
a=0;//     invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 611
a=0;//     .end local v1    # "errorcode":I
a=0;//     .restart local v2    # "errorcode":I
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 604
a=0;//     .end local v2    # "errorcode":I
a=0;//     .restart local v1    # "errorcode":I
a=0;//     :catch_0
a=0;//     #v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 606
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "getPid exception ...5052"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 607
a=0;//     const/16 v1, 0x13bc
a=0;// 
a=0;//     .line 608
a=0;//     #v1=(PosShort);
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "error pid : "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ", len="
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 609
a=0;//     .end local v1    # "errorcode":I
a=0;//     .restart local v2    # "errorcode":I
a=0;//     #v2=(PosShort);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static checkSidSignature(Ljava/util/Hashtable;Ljava/util/Hashtable;)Ljava/util/Hashtable;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 624
a=0;//     .local p0, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .local p1, "httphead":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     const-string v0, "sidSignature"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "sidSignature"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 625
a=0;//     const-string v0, "sidSignature"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 626
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "errorCode"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x1485
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 627
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkTToken(Ljava/util/Hashtable;Ljava/util/Hashtable;)Ljava/util/Hashtable;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 632
a=0;//     .local p0, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     .local p1, "httphead":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     const-string v0, "ttoken"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "ttoken"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 633
a=0;//     const-string v0, "ttoken"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 634
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "errorCode"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x1486
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 635
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkToken(Ljava/lang/String;)I
a=0;//     .locals 5
a=0;//     .param p0, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 640
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 641
a=0;//     .local v0, "statuscode":I
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/16 v3, 0x2c
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v2, v3, :cond_1
a=0;// 
a=0;//     .line 642
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/16 v0, 0x138c
a=0;// 
a=0;//     .line 643
a=0;//     #v0=(PosShort);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "Token is invalid....5004"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 644
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Token is :"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\n"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 647
a=0;//     .end local v0    # "statuscode":I
a=0;//     .local v1, "statuscode":I
a=0;//     :goto_0
a=0;//     #v1=(PosShort);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .end local v1    # "statuscode":I
a=0;//     .restart local v0    # "statuscode":I
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Integer);v3=(PosByte);v4=(Uninit);
a=0;//     move v1, v0
a=0;// 
a=0;//     .end local v0    # "statuscode":I
a=0;//     .restart local v1    # "statuscode":I
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkToken(Ljava/util/Hashtable;Ljava/lang/String;)Ljava/util/Hashtable;
a=0;//     .locals 4
a=0;//     .param p1, "token"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
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
a=0;//     .line 615
a=0;//     .local p0, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     invoke-static {p1}, Lcom/cmcc/omp/security/CmccOmpUtility;->checkToken(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 616
a=0;//     .local v0, "status":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 617
a=0;//     const-string v1, "errorCode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 619
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected static checkURL(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, 0x13ed
a=0;// 
a=0;//     .line 853
a=0;//     #v0=(PosShort);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 854
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v1, "CmccOmpUtility"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "url error, url=("
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "), errorcode="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 855
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 854
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 858
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static native getEncryptedIMSI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method protected static getEncryptedInfo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "counter"    # Ljava/lang/String;
a=0;//     .param p2, "plaincontent"    # Ljava/lang/String;
a=0;//     .param p3, "enccontent"    # Ljava/lang/String;
a=0;//     .param p4, "ids"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 982
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 983
a=0;//     check-cast p0, Landroid/content/ContextWrapper;
a=0;// 
a=0;//     .end local p0    # "ctx":Landroid/content/Context;
a=0;//     invoke-virtual {p0}, Landroid/content/ContextWrapper;->getPackageResourcePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     .line 984
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v5, Lcom/cmcc/omp/security/CmccOmpUtility;->Install_apk_path:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     move-object v1, p2
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p3
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p4
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/cmcc/omp/security/CmccOmpUtility;->GetEncryptedContFlex(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getHeadField(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "fieldname"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 351
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 352
a=0;//     .local v0, "field":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->headlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lt v1, v4, :cond_0
a=0;// 
a=0;//     .line 359
a=0;//     return-object v0
a=0;// 
a=0;//     .line 353
a=0;//     :cond_0
a=0;//     sget-object v4, Lcom/cmcc/omp/security/CmccOmpUtility;->headlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 354
a=0;//     .local v3, "line":Ljava/lang/String;
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, ":"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 355
a=0;//     .local v2, "index":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v2, v4, :cond_1
a=0;// 
a=0;//     .line 356
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v2
a=0;// 
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 352
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static getRandomIMSI()Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     .line 256
a=0;//     #v7=(PosByte);
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 257
a=0;//     .local v1, "imsi":Ljava/lang/StringBuffer;
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     new-array v2, v7, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-string v6, "0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const-string v6, "1"
a=0;// 
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const-string v6, "2"
a=0;// 
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     const-string v6, "3"
a=0;// 
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     const-string v6, "4"
a=0;// 
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/4 v5, 0x5
a=0;// 
a=0;//     const-string v6, "5"
a=0;// 
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     const-string v6, "6"
a=0;// 
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/4 v5, 0x7
a=0;// 
a=0;//     const-string v6, "7"
a=0;// 
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     const-string v6, "8"
a=0;// 
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     const/16 v5, 0x9
a=0;// 
a=0;//     const-string v6, "9"
a=0;// 
a=0;//     aput-object v6, v2, v5
a=0;// 
a=0;//     .line 258
a=0;//     .local v2, "numstr":[Ljava/lang/String;
a=0;//     new-instance v3, Ljava/util/Random;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v3}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     .line 259
a=0;//     .local v3, "r":Ljava/util/Random;
a=0;//     #v3=(Reference,Ljava/util/Random;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     const/16 v5, 0xe
a=0;// 
a=0;//     if-lt v0, v5, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 263
a=0;//     .local v4, "s":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 260
a=0;//     .end local v4    # "s":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v4=(Uninit);
a=0;//     invoke-virtual {v3, v7}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget-object v5, v2, v5
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 259
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static native getSeed(Ljava/lang/String;Ljava/lang/String;)I
a=0;// .end method
a=0;// 
a=0;// .method public static native getToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method protected static gettimestamp()Ljava/lang/String;
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v11, 0xa
a=0;// 
a=0;//     .line 214
a=0;//     #v11=(PosByte);
a=0;//     new-instance v5, Landroid/text/format/Time;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/text/format/Time;);
a=0;//     invoke-direct {v5}, Landroid/text/format/Time;-><init>()V
a=0;// 
a=0;//     .line 215
a=0;//     .local v5, "t":Landroid/text/format/Time;
a=0;//     #v5=(Reference,Landroid/text/format/Time;);
a=0;//     invoke-virtual {v5}, Landroid/text/format/Time;->setToNow()V
a=0;// 
a=0;//     .line 216
a=0;//     new-instance v7, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 217
a=0;//     .local v7, "time":Ljava/lang/StringBuffer;
a=0;//     #v7=(Reference,Ljava/lang/StringBuffer;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v10, v5, Landroid/text/format/Time;->year:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 218
a=0;//     .local v8, "year":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 220
a=0;//     iget v9, v5, Landroid/text/format/Time;->month:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/lit8 v2, v9, 0x1
a=0;// 
a=0;//     .line 221
a=0;//     .local v2, "month":I
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v11, :cond_0
a=0;// 
a=0;//     .line 222
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v10, Lcom/cmcc/omp/security/CmccOmpUtility;->temp:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 225
a=0;//     :goto_0
a=0;//     iget v3, v5, Landroid/text/format/Time;->monthDay:I
a=0;// 
a=0;//     .line 226
a=0;//     .local v3, "monthDay":I
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v11, :cond_1
a=0;// 
a=0;//     .line 227
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v10, Lcom/cmcc/omp/security/CmccOmpUtility;->temp:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     sput-object v9, Lcom/cmcc/omp/security/CmccOmpUtility;->isVerifyHmac:Ljava/lang/String;
a=0;// 
a=0;//     .line 228
a=0;//     sget-object v9, Lcom/cmcc/omp/security/CmccOmpUtility;->isVerifyHmac:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 233
a=0;//     :goto_1
a=0;//     iget v0, v5, Landroid/text/format/Time;->hour:I
a=0;// 
a=0;//     .line 234
a=0;//     .local v0, "hour":I
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v11, :cond_2
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v10, Lcom/cmcc/omp/security/CmccOmpUtility;->temp:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 238
a=0;//     :goto_2
a=0;//     iget v1, v5, Landroid/text/format/Time;->minute:I
a=0;// 
a=0;//     .line 239
a=0;//     .local v1, "minute":I
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v11, :cond_3
a=0;// 
a=0;//     .line 240
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v10, Lcom/cmcc/omp/security/CmccOmpUtility;->temp:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 243
a=0;//     :goto_3
a=0;//     iget v4, v5, Landroid/text/format/Time;->second:I
a=0;// 
a=0;//     .line 244
a=0;//     .local v4, "second":I
a=0;//     #v4=(Integer);
a=0;//     if-ge v4, v11, :cond_4
a=0;// 
a=0;//     .line 245
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v10, Lcom/cmcc/omp/security/CmccOmpUtility;->temp:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 249
a=0;//     :goto_4
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 250
a=0;//     .local v6, "tempTimestamp":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "CmccOmpUtilitytime"
a=0;// 
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, " gettimestamp() , timestamp = "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v11, Lcom/cmcc/omp/security/CmccOmpUtility;->timestamp:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v9, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 251
a=0;//     invoke-static {v6}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->setTimestamp(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 252
a=0;//     return-object v6
a=0;// 
a=0;//     .line 224
a=0;//     .end local v0    # "hour":I
a=0;//     .end local v1    # "minute":I
a=0;//     .end local v3    # "monthDay":I
a=0;//     .end local v4    # "second":I
a=0;//     .end local v6    # "tempTimestamp":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v9=(Integer);v11=(PosByte);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 230
a=0;//     .restart local v3    # "monthDay":I
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     sput-object v9, Lcom/cmcc/omp/security/CmccOmpUtility;->isVerifyHmac:Ljava/lang/String;
a=0;// 
a=0;//     .line 231
a=0;//     sget-object v9, Lcom/cmcc/omp/security/CmccOmpUtility;->isVerifyHmac:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 237
a=0;//     .restart local v0    # "hour":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 242
a=0;//     .restart local v1    # "minute":I
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 247
a=0;//     .restart local v4    # "second":I
a=0;//     :cond_4
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method protected static initParameters(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 13
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "appid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 158
a=0;//     #v9=(Null);
a=0;//     const-string v10, "CmccOmpUtility"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "url = "
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, " , appid = "
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 159
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     const-string v10, "CmccOmpUtility"
a=0;// 
a=0;//     const-string v11, "local init failed...5053context is null"
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 162
a=0;//     sput-boolean v9, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->INIT_STATE:Z
a=0;// 
a=0;//     .line 163
a=0;//     sget-boolean v9, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->INIT_STATE:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     invoke-static {v9}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->setInitState(Z)V
a=0;// 
a=0;//     .line 165
a=0;//     const/16 v9, 0x13bd
a=0;// 
a=0;//     .line 207
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(PosShort);v10=(Conflicted);v12=(Conflicted);
a=0;//     return v9
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Null);v10=(Reference,Ljava/lang/String;);v12=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     if-nez v10, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     :cond_1
a=0;//     #v10=(Conflicted);
a=0;//     const-string v10, "CmccOmpUtility"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v11, "init parameters error...5100appid or url error"
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 171
a=0;//     sput-boolean v9, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->INIT_STATE:Z
a=0;// 
a=0;//     .line 172
a=0;//     const/16 v9, 0x13ec
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 175
a=0;//     :cond_2
a=0;//     #v9=(Null);v10=(Integer);
a=0;//     const-string v10, "phone"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 174
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 176
a=0;//     .local v8, "telephonyManager":Landroid/telephony/TelephonyManager;
a=0;//     sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     .line 177
a=0;//     .local v4, "devicemodel":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     .line 178
a=0;//     .local v6, "release":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 179
a=0;//     .local v0, "carrier":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 180
a=0;//     .local v1, "devId":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     .line 182
a=0;//     .local v2, "deviceId":J
a=0;//     :try_start_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 186
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-virtual {v8}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 187
a=0;//     .local v7, "subscriberID":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "devicemodel = "
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, " , carrier = "
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 188
a=0;//     const-string v12, " , deviceId = "
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     const-string v12, " ,release = "
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 189
a=0;//     const-string v12, " ,subscriberID = "
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 187
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 190
a=0;//     const-string v10, "google_sdk"
a=0;// 
a=0;//     invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_3
a=0;// 
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     cmp-long v10, v2, v10
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-nez v10, :cond_4
a=0;// 
a=0;//     .line 192
a=0;//     :cond_3
a=0;//     #v11=(Conflicted);
a=0;//     const-string v10, "CmccOmpUtility"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v11, "google_sdk...simulator is running...not apn setting"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 193
a=0;//     sput-boolean v9, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_SETTING_APN:Z
a=0;// 
a=0;//     .line 194
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     sput-boolean v10, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_SIMULATOR:Z
a=0;// 
a=0;//     .line 201
a=0;//     :goto_2
a=0;//     #v10=(Conflicted);v12=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->initSharedPreferences(Landroid/content/Context;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 183
a=0;//     .end local v7    # "subscriberID":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v5=(Uninit);v7=(Uninit);v10=(Reference,Ljava/lang/String;);v12=(Reference,Ljava/lang/String;);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 184
a=0;//     .local v5, "e":Ljava/lang/Exception;
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v10, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "deviceID exception,e="
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 196
a=0;//     .end local v5    # "e":Ljava/lang/Exception;
a=0;//     .restart local v7    # "subscriberID":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v5=(Conflicted);v7=(Reference,Ljava/lang/String;);v10=(Byte);v11=(LongHi);
a=0;//     sput-boolean v9, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_SIMULATOR:Z
a=0;// 
a=0;//     .line 197
a=0;//     sget-boolean v10, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CHANGE_MANUAL:Z
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     sput-boolean v10, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_SETTING_APN:Z
a=0;// 
a=0;//     .line 199
a=0;//     const-string v10, "CmccOmpUtility"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "apn setting wap...IS_SETTING_APN = "
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-boolean v12, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_SETTING_APN:Z
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected static inputStreamToByte(Ljava/io/InputStream;)[B
a=0;//     .locals 21
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 371
a=0;//     new-instance v4, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 372
a=0;//     .local v4, "bytestream":Ljava/io/ByteArrayOutputStream;
a=0;//     #v4=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v18, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v18, Lcom/cmcc/omp/security/CmccOmpUtility;->headlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 373
a=0;//     const/16 v18, 0x4
a=0;// 
a=0;//     #v18=(PosByte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     .line 374
a=0;//     .local v16, "temp":[I
a=0;//     #v16=(Reference,[I);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 375
a=0;//     .local v9, "i":I
a=0;//     #v9=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 376
a=0;//     .local v3, "bodySize":I
a=0;//     #v3=(Null);
a=0;//     const-string v18, "CmccOmpUtility"
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     const-string v19, "start while header info ........."
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v18 .. v19}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 379
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v9=(Integer);v18=(Conflicted);v19=(Conflicted);
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     .line 380
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 381
a=0;//     .local v2, "a":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;// 
a=0;//     .line 382
a=0;//     rem-int/lit8 v18, v9, 0x4
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     aput v2, v16, v18
a=0;// 
a=0;//     .line 383
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     aget v18, v16, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     const/16 v19, 0xa
a=0;// 
a=0;//     #v19=(PosByte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     #v18=(One);
a=0;//     aget v18, v16, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     const/16 v19, 0xd
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     const/16 v18, 0x2
a=0;// 
a=0;//     #v18=(PosByte);
a=0;//     aget v18, v16, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     const/16 v19, 0xa
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     const/16 v18, 0x3
a=0;// 
a=0;//     #v18=(PosByte);
a=0;//     aget v18, v16, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     const/16 v19, 0xd
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     if-eq v0, v1, :cond_2
a=0;// 
a=0;//     .line 384
a=0;//     :cond_1
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     aget v18, v16, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     const/16 v19, 0xd
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     #v18=(One);
a=0;//     aget v18, v16, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     const/16 v19, 0xa
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     const/16 v18, 0x2
a=0;// 
a=0;//     #v18=(PosByte);
a=0;//     aget v18, v16, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     const/16 v19, 0xd
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     const/16 v18, 0x3
a=0;// 
a=0;//     #v18=(PosByte);
a=0;//     aget v18, v16, v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     const/16 v19, 0xa
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     .line 386
a=0;//     :cond_2
a=0;//     invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 387
a=0;//     .local v6, "headerData":[B
a=0;//     #v6=(Reference,[B);
a=0;//     new-instance v7, Ljava/lang/String;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v18, "UTF-8"
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v6, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 389
a=0;//     .local v7, "headerStr":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "\r\n"
a=0;// 
a=0;//     .line 390
a=0;//     .local v13, "regex":Ljava/lang/String;
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 391
a=0;//     .local v8, "headstrarray":[Ljava/lang/String;
a=0;//     #v8=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .local v11, "j":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v11=(Integer);v19=(Conflicted);
a=0;//     array-length v0, v8
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     if-lt v11, v0, :cond_7
a=0;// 
a=0;//     .line 394
a=0;//     const-string v18, "CONTENT-LENGTH"
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v18 .. v18}, Lcom/cmcc/omp/security/CmccOmpUtility;->getHeadField(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 395
a=0;//     .local v5, "contlen":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     const-string v18, ""
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     #v18=(Boolean);
a=0;//     if-eqz v18, :cond_4
a=0;// 
a=0;//     .line 396
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v18=(Conflicted);
a=0;//     const-string v5, "0"
a=0;// 
a=0;//     .line 398
a=0;//     :cond_4
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 406
a=0;//     .end local v5    # "contlen":Ljava/lang/String;
a=0;//     .end local v6    # "headerData":[B
a=0;//     .end local v7    # "headerStr":Ljava/lang/String;
a=0;//     .end local v8    # "headstrarray":[Ljava/lang/String;
a=0;//     .end local v11    # "j":I
a=0;//     .end local v13    # "regex":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);v13=(Conflicted);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 407
a=0;//     .local v12, "len":I
a=0;//     #v12=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 409
a=0;//     .local v14, "returnData":[B
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v10=(Conflicted);v12=(Integer);v14=(Null);v15=(Conflicted);v17=(Conflicted);
a=0;//     if-nez v3, :cond_9
a=0;// 
a=0;//     .line 410
a=0;//     const-string v18, "CmccOmpUtility"
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     const-string v19, " bodySize == 0 ......"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v18 .. v19}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 428
a=0;//     :cond_6
a=0;//     :goto_2
a=0;//     #v18=(Conflicted);v19=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 429
a=0;//     #v14=(Reference,[B);
a=0;//     invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 430
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 431
a=0;//     const-string v18, "CmccOmpUtility"
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     new-instance v19, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v19=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v20, " httpbodyArray.length = "
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v0, v14
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-static/range {v18 .. v19}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 432
a=0;//     return-object v14
a=0;// 
a=0;//     .line 392
a=0;//     .end local v12    # "len":I
a=0;//     .end local v14    # "returnData":[B
a=0;//     .restart local v6    # "headerData":[B
a=0;//     .restart local v7    # "headerStr":Ljava/lang/String;
a=0;//     .restart local v8    # "headstrarray":[Ljava/lang/String;
a=0;//     .restart local v11    # "j":I
a=0;//     .restart local v13    # "regex":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     #v1=(PosByte);v3=(Null);v5=(Uninit);v6=(Reference,[B);v7=(Reference,Ljava/lang/String;);v8=(Reference,[Ljava/lang/String;);v10=(Uninit);v11=(Integer);v12=(Uninit);v13=(Reference,Ljava/lang/String;);v14=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Integer);v19=(Conflicted);v20=(Uninit);
a=0;//     sget-object v18, Lcom/cmcc/omp/security/CmccOmpUtility;->headlist:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v18=(Reference,Ljava/util/ArrayList;);
a=0;//     aget-object v19, v8, v11
a=0;// 
a=0;//     #v19=(Null);
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 391
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 400
a=0;//     .end local v6    # "headerData":[B
a=0;//     .end local v7    # "headerStr":Ljava/lang/String;
a=0;//     .end local v8    # "headstrarray":[Ljava/lang/String;
a=0;//     .end local v11    # "j":I
a=0;//     .end local v13    # "regex":Ljava/lang/String;
a=0;//     :cond_8
a=0;//     #v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Uninit);v13=(Uninit);v18=(Integer);v19=(PosByte);
a=0;//     const/16 v18, -0x1
a=0;// 
a=0;//     #v18=(Byte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v2, v0, :cond_0
a=0;// 
a=0;//     .line 401
a=0;//     const-string v18, "CmccOmpUtility"
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     const-string v19, "read  -1 end ........"
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v18 .. v19}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 413
a=0;//     .restart local v12    # "len":I
a=0;//     .restart local v14    # "returnData":[B
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Integer);v13=(Conflicted);v14=(Null);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 414
a=0;//     .local v15, "size":I
a=0;//     #v15=(Integer);
a=0;//     if-nez v15, :cond_a
a=0;// 
a=0;//     .line 415
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     .line 417
a=0;//     :cond_a
a=0;//     new-array v0, v15, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     .line 418
a=0;//     .local v17, "tempdata":[B
a=0;//     #v17=(Reference,[B);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 419
a=0;//     .local v10, "isRead":I
a=0;//     #v10=(Integer);
a=0;//     const/16 v18, -0x1
a=0;// 
a=0;//     #v18=(Byte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v10, v0, :cond_6
a=0;// 
a=0;//     .line 422
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 423
a=0;//     add-int/2addr v12, v15
a=0;// 
a=0;//     .line 424
a=0;//     if-lt v12, v3, :cond_5
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected static isConnect()Z
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 273
a=0;//     #v6=(Null);
a=0;//     sget-object v8, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 274
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     const-string v9, "connectivity"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 273
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 275
a=0;//     .local v2, "manager":Landroid/net/ConnectivityManager;
a=0;//     invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 277
a=0;//     .local v3, "networkinfo":Landroid/net/NetworkInfo;
a=0;//     #v3=(Reference,Landroid/net/NetworkInfo;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 279
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v8=(Conflicted);v9=(Conflicted);
a=0;//     const/16 v8, 0x28
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-le v1, v8, :cond_1
a=0;// 
a=0;//     .line 281
a=0;//     const-string v7, "CmccOmpUtility"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "waiting get networkinfo time out"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 340
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 284
a=0;//     :cond_1
a=0;//     #v4=(Uninit);v5=(Uninit);v6=(Null);v7=(One);v8=(PosByte);v10=(Uninit);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 296
a=0;//     invoke-virtual {v3}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 298
a=0;//     .local v4, "stringExtraInfo":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 299
a=0;//     .local v5, "typeName":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "CmccOmpUtility_isConnect"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "networkinfo = "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 300
a=0;//     const-string v10, " typeName = "
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 299
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 301
a=0;//     const-string v8, "CmccOmpUtility"
a=0;// 
a=0;//     .line 302
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "curConfUrlField.getWapMode() is "
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 303
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v10, Lcom/cmcc/omp/security/CmccOmpUtility;->curConfUrlField:Lcom/cmcc/omp/util/ConfUrlField;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/cmcc/omp/util/ConfUrlField;->getWapMode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 302
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 301
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 304
a=0;//     sget-object v8, Lcom/cmcc/omp/security/CmccOmpUtility;->curConfUrlField:Lcom/cmcc/omp/util/ConfUrlField;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/cmcc/omp/util/ConfUrlField;->getWapMode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "1"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 305
a=0;//     sput-boolean v6, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CMWAP:Z
a=0;// 
a=0;//     .line 306
a=0;//     const-string v6, "CmccOmpUtility"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "SMS initialize"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 307
a=0;//     #v6=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 288
a=0;//     .end local v4    # "stringExtraInfo":Ljava/lang/String;
a=0;//     .end local v5    # "typeName":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v4=(Uninit);v5=(Uninit);v6=(Null);v8=(PosByte);v9=(Conflicted);v10=(Uninit);
a=0;//     const-wide/16 v8, 0x1f4
a=0;// 
a=0;//     :try_start_0
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 292
a=0;//     :goto_2
a=0;//     invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 293
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 278
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 289
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 290
a=0;//     .local v0, "e":Ljava/lang/InterruptedException;
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 309
a=0;//     .end local v0    # "e":Ljava/lang/InterruptedException;
a=0;//     .restart local v4    # "stringExtraInfo":Ljava/lang/String;
a=0;//     .restart local v5    # "typeName":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v8=(Boolean);v9=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "wifi"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     .line 311
a=0;//     sput-boolean v6, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CMWAP:Z
a=0;// 
a=0;//     .line 312
a=0;//     const-string v6, "CmccOmpUtility"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "wifi"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 313
a=0;//     #v6=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 316
a=0;//     :cond_4
a=0;//     #v6=(Null);v8=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     const-string v8, "labwap3"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     .line 319
a=0;//     const-string v6, "CmccOmpUtility"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "labwap3"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 320
a=0;//     sput-boolean v7, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_TEST_APN:Z
a=0;// 
a=0;//     .line 321
a=0;//     sput-boolean v7, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CMWAP:Z
a=0;// 
a=0;//     .line 323
a=0;//     const-string v6, "192.168.230.8"
a=0;// 
a=0;//     sput-object v6, Lcom/cmcc/omp/security/CmccOmpUtility;->wapApn:Ljava/lang/String;
a=0;// 
a=0;//     .line 324
a=0;//     const/16 v6, 0x2344
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     sput v6, Lcom/cmcc/omp/security/CmccOmpUtility;->wapApnPort:I
a=0;// 
a=0;//     :goto_3
a=0;//     #v6=(Conflicted);
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 338
a=0;//     #v6=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 326
a=0;//     :cond_5
a=0;//     #v6=(Null);v8=(Boolean);
a=0;//     const-string v8, "cmwap"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     .line 327
a=0;//     const-string v8, "CmccOmpUtility"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "cmwap"
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 328
a=0;//     sput-boolean v6, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_TEST_APN:Z
a=0;// 
a=0;//     .line 329
a=0;//     sput-boolean v7, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CMWAP:Z
a=0;// 
a=0;//     .line 331
a=0;//     sget-object v6, Lcom/cmcc/omp/security/CmccOmpUtility;->cmwapApn:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     sput-object v6, Lcom/cmcc/omp/security/CmccOmpUtility;->wapApn:Ljava/lang/String;
a=0;// 
a=0;//     .line 332
a=0;//     sget v6, Lcom/cmcc/omp/security/CmccOmpUtility;->cmwapApnPort:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sput v6, Lcom/cmcc/omp/security/CmccOmpUtility;->wapApnPort:I
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 335
a=0;//     :cond_6
a=0;//     #v6=(Null);v8=(Boolean);
a=0;//     sput-boolean v6, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CMWAP:Z
a=0;// 
a=0;//     .line 336
a=0;//     const-string v6, "CmccOmpUtility"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "cmnet"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method protected static isDeviceRegister(Ljava/lang/String;)I
a=0;//     .locals 5
a=0;//     .param p0, "ids"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->getDeviceid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 503
a=0;//     .local v1, "storeDeviceid":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "storeDeviceid length = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 504
a=0;//     sget-object v2, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2, p0}, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->getDeviceid(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 505
a=0;//     .local v0, "curDeviceid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "curDeviceid length = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 506
a=0;//     invoke-static {v1}, Lcom/cmcc/omp/security/CmccOmpInitEnvBySSO;->strIsNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 507
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 508
a=0;//     :cond_0
a=0;//     const-string v2, "CmccOmpUtility"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "deviceid is error : storeDeviceid="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 509
a=0;//     const-string v4, " , curDeviceid="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 508
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 510
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->clearAllData()V
a=0;// 
a=0;//     .line 511
a=0;//     const/16 v2, 0x138a
a=0;// 
a=0;//     .line 513
a=0;//     :goto_0
a=0;//     #v2=(PosShort);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v4=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static parseHttpUrlConnResp(Ljava/net/HttpURLConnection;Ljava/util/Hashtable;ILjava/lang/String;)Ljava/util/Hashtable;
a=0;//     .locals 12
a=0;//     .param p0, "httpUrlConnection"    # Ljava/net/HttpURLConnection;
a=0;//     .param p2, "code"    # I
a=0;//     .param p3, "statuscode"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/net/HttpURLConnection;",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;I",
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
a=0;//     .line 688
a=0;//     .local p1, "th":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 690
a=0;//     .local v2, "is":Ljava/io/InputStream;
a=0;//     #v2=(Null);
a=0;//     const/16 v8, 0xc8
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     if-ne p2, v8, :cond_2
a=0;// 
a=0;//     .line 691
a=0;//     :try_start_0
a=0;//     sget-object v8, Lcom/cmcc/omp/security/CmccOmpUtility;->curConfUrlField:Lcom/cmcc/omp/util/ConfUrlField;
a=0;// 
a=0;//     #v8=(Reference,Lcom/cmcc/omp/util/ConfUrlField;);
a=0;//     invoke-virtual {v8}, Lcom/cmcc/omp/util/ConfUrlField;->getTestMode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "0"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 692
a=0;//     const-string v8, "0"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 693
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 695
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 696
a=0;//     .local v0, "bytestream":Ljava/io/ByteArrayOutputStream;
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 697
a=0;//     .local v4, "len":I
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 700
a=0;//     .local v5, "returnData":[B
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Integer);v5=(Null);v6=(Conflicted);v7=(Conflicted);v8=(Byte);
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->available()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 701
a=0;//     .local v6, "size":I
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 702
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 704
a=0;//     :cond_1
a=0;//     new-array v7, v6, [B
a=0;// 
a=0;//     .line 705
a=0;//     .local v7, "tempdata":[B
a=0;//     #v7=(Reference,[B);
a=0;//     invoke-virtual {v2, v7}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 706
a=0;//     .local v3, "isRead":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     if-ne v3, v8, :cond_3
a=0;// 
a=0;//     .line 712
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 713
a=0;//     #v5=(Reference,[B);
a=0;//     const-string v8, "CmccOmpUtility"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "EnableCalling answer is ...:\n"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 714
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v10, Ljava/lang/String;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v11, "UTF-8"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v5, v11}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 713
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 715
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 716
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 718
a=0;//     const-string v8, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "returnData = "
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 719
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v10, Ljava/lang/String;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v11, "UTF-8"
a=0;// 
a=0;//     invoke-direct {v10, v5, v11}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 718
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 720
a=0;//     const-string v8, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "received len = "
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 721
a=0;//     const-string v8, "respBody"
a=0;// 
a=0;//     invoke-virtual {p1, v8, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 728
a=0;//     .end local v0    # "bytestream":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v3    # "isRead":I
a=0;//     .end local v4    # "len":I
a=0;//     .end local v5    # "returnData":[B
a=0;//     .end local v6    # "size":I
a=0;//     .end local v7    # "tempdata":[B
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 709
a=0;//     .restart local v0    # "bytestream":Ljava/io/ByteArrayOutputStream;
a=0;//     .restart local v3    # "isRead":I
a=0;//     .restart local v4    # "len":I
a=0;//     .restart local v5    # "returnData":[B
a=0;//     .restart local v6    # "size":I
a=0;//     .restart local v7    # "tempdata":[B
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);v1=(Uninit);v3=(Integer);v4=(Integer);v5=(Null);v6=(Integer);v7=(Reference,[B);v8=(Byte);v9=(Reference,Ljava/lang/String;);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-virtual {v0, v7}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 710
a=0;//     add-int/2addr v4, v6
a=0;// 
a=0;//     .line 699
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 724
a=0;//     .end local v0    # "bytestream":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v3    # "isRead":I
a=0;//     .end local v4    # "len":I
a=0;//     .end local v5    # "returnData":[B
a=0;//     .end local v6    # "size":I
a=0;//     .end local v7    # "tempdata":[B
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 725
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     const-string v8, "errorCode"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v9, "5151"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v8, v9}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 726
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static sendSocketRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 18
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;//     .param p1, "postUrl"    # Ljava/lang/String;
a=0;//     .param p2, "Str"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 734
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v14
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     sput-wide v14, Lcom/cmcc/omp/security/CmccOmpUtility;->t3:J
a=0;// 
a=0;//     .line 735
a=0;//     const-string v14, "OMSSEXECTIME"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "COMUNICATE_TIME: start time = "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 736
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v16, Lcom/cmcc/omp/security/CmccOmpUtility;->t3:J
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     invoke-virtual/range {v15 .. v17}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 735
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 737
a=0;//     sget-wide v14, Lcom/cmcc/omp/security/CmccOmpUtility;->t3:J
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     sget-wide v16, Lcom/cmcc/omp/security/CmccOmpUtility;->t1:J
a=0;// 
a=0;//     sub-long v14, v14, v16
a=0;// 
a=0;//     sput-wide v14, Lcom/cmcc/omp/security/CmccOmpUtility;->t7:J
a=0;// 
a=0;//     .line 738
a=0;//     const-string v14, "OMSSEXECTIME"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "C_EXECTIME: consuming time = "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 739
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v16, Lcom/cmcc/omp/security/CmccOmpUtility;->t7:J
a=0;// 
a=0;//     #v16=(LongLo);
a=0;//     invoke-virtual/range {v15 .. v17}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 738
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 740
a=0;//     const-string v7, ""
a=0;// 
a=0;//     .line 741
a=0;//     .local v7, "returnStr":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 742
a=0;//     .local v12, "wr":Ljava/io/BufferedWriter;
a=0;//     #v12=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 743
a=0;//     .local v9, "socket":Ljava/net/Socket;
a=0;//     #v9=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 744
a=0;//     .local v4, "length":I
a=0;//     #v4=(Null);
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     .line 745
a=0;//     invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 750
a=0;//     :try_start_0
a=0;//     #v4=(Integer);
a=0;//     new-instance v6, Ljava/net/URL;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/net/URL;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 751
a=0;//     .local v6, "purl":Ljava/net/URL;
a=0;//     #v6=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v6}, Ljava/net/URL;->getHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 752
a=0;//     .local v3, "hostname":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v14, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "hostname = "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 755
a=0;//     invoke-virtual {v6}, Ljava/net/URL;->getPort()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 756
a=0;//     .local v5, "port":I
a=0;//     #v5=(Integer);
a=0;//     if-gez v5, :cond_0
a=0;// 
a=0;//     .line 757
a=0;//     const/16 v5, 0x50
a=0;// 
a=0;//     .line 760
a=0;//     :cond_0
a=0;//     invoke-virtual {v6}, Ljava/net/URL;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 762
a=0;//     const-string v14, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "port = "
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 763
a=0;//     sget-boolean v14, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CMWAP:Z
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_6
a=0;// 
a=0;//     .line 764
a=0;//     new-instance v10, Ljava/net/Socket;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/net/Socket;);
a=0;//     sget-object v14, Lcom/cmcc/omp/security/CmccOmpUtility;->wapApn:Ljava/lang/String;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     sget v15, Lcom/cmcc/omp/security/CmccOmpUtility;->wapApnPort:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-direct {v10, v14, v15}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .end local v9    # "socket":Ljava/net/Socket;
a=0;//     .local v10, "socket":Ljava/net/Socket;
a=0;//     #v10=(Reference,Ljava/net/Socket;);
a=0;//     move-object v9, v10
a=0;// 
a=0;//     .line 769
a=0;//     .end local v10    # "socket":Ljava/net/Socket;
a=0;//     .restart local v9    # "socket":Ljava/net/Socket;
a=0;//     :goto_0
a=0;//     #v9=(Reference,Ljava/net/Socket;);v14=(Conflicted);v15=(Conflicted);
a=0;//     const v14, 0x15f90
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v9, v14}, Ljava/net/Socket;->setSoTimeout(I)V
a=0;// 
a=0;//     .line 770
a=0;//     invoke-virtual {v9}, Ljava/net/Socket;->getSoTimeout()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 771
a=0;//     .local v11, "to":I
a=0;//     #v11=(Integer);
a=0;//     const-string v14, "CmccOmpUtility"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "default timeout"
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 774
a=0;//     new-instance v13, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v14, Ljava/io/OutputStreamWriter;
a=0;// 
a=0;//     .line 775
a=0;//     #v14=(UninitRef,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-virtual {v9}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "utf-8"
a=0;// 
a=0;//     invoke-direct/range {v14 .. v16}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 774
a=0;//     #v14=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-direct {v13, v14}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 776
a=0;//     .end local v12    # "wr":Ljava/io/BufferedWriter;
a=0;//     .local v13, "wr":Ljava/io/BufferedWriter;
a=0;//     :try_start_1
a=0;//     #v13=(Reference,Ljava/io/BufferedWriter;);
a=0;//     sget-boolean v14, Lcom/cmcc/omp/security/CmccOmpUtility;->IS_CMWAP:Z
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_7
a=0;// 
a=0;//     .line 777
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "POST http://"
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, ":"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 778
a=0;//     const-string v15, " HTTP/1.1\r\n"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 777
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 782
a=0;//     :goto_1
a=0;//     const-string v14, "Content-type: application/x-java-serialized-object\r\n"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 783
a=0;//     const-string v14, "Cache-Control: no-cache\r\n"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 784
a=0;//     const-string v14, "Pragma: no-cache\r\n"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 785
a=0;//     const-string v14, "User-Agent: Java/1.5.0_07\r\n"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 786
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Host: "
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, ":"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 787
a=0;//     const-string v14, "Accept: text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2\r\n"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 788
a=0;//     const-string v14, "Connection: keep-alive\r\n"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 789
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Content-Length: "
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 790
a=0;//     const-string v14, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 793
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v13, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 794
a=0;//     invoke-virtual {v13}, Ljava/io/BufferedWriter;->flush()V
a=0;// 
a=0;//     .line 796
a=0;//     new-instance v7, Ljava/lang/String;
a=0;// 
a=0;//     .end local v7    # "returnStr":Ljava/lang/String;
a=0;//     #v7=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v9}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14}, Lcom/cmcc/omp/security/CmccOmpUtility;->inputStreamToByte(Ljava/io/InputStream;)[B
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 797
a=0;//     const-string v15, "UTF-8"
a=0;// 
a=0;//     .line 796
a=0;//     invoke-direct {v7, v14, v15}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_3
a=0;// 
a=0;//     .line 801
a=0;//     .restart local v7    # "returnStr":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v13, :cond_1
a=0;// 
a=0;//     .line 803
a=0;//     :try_start_2
a=0;//     invoke-virtual {v13}, Ljava/io/BufferedWriter;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     .line 808
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     .line 810
a=0;//     :try_start_3
a=0;//     invoke-virtual {v9}, Ljava/net/Socket;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_2
a=0;// 
a=0;//     .line 814
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 819
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v14
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     sput-wide v14, Lcom/cmcc/omp/security/CmccOmpUtility;->t4:J
a=0;// 
a=0;//     .line 820
a=0;//     const-string v14, "OMSSEXECTIME"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "COMUNICATE_TIME: end time = "
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 821
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v16, Lcom/cmcc/omp/security/CmccOmpUtility;->t4:J
a=0;// 
a=0;//     #v16=(LongLo);
a=0;//     invoke-virtual/range {v15 .. v17}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 820
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 822
a=0;//     sget-wide v14, Lcom/cmcc/omp/security/CmccOmpUtility;->t4:J
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     sget-wide v16, Lcom/cmcc/omp/security/CmccOmpUtility;->t3:J
a=0;// 
a=0;//     sub-long v14, v14, v16
a=0;// 
a=0;//     sput-wide v14, Lcom/cmcc/omp/security/CmccOmpUtility;->t6:J
a=0;// 
a=0;//     .line 823
a=0;//     const-string v14, "OMSSEXECTIME"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "COMUNICATE_TIME: consuming time = "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 824
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-wide v16, Lcom/cmcc/omp/security/CmccOmpUtility;->t6:J
a=0;// 
a=0;//     #v16=(LongLo);
a=0;//     invoke-virtual/range {v15 .. v17}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 823
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 826
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 827
a=0;//     const-string v14, " "
a=0;// 
a=0;//     const-string v15, ""
a=0;// 
a=0;//     invoke-virtual {v7, v14, v15}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 828
a=0;//     const-string v14, "<statuscode>"
a=0;// 
a=0;//     invoke-virtual {v7, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_4
a=0;// 
a=0;//     .line 830
a=0;//     const-string v14, "<statuscode>"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-int/lit8 v14, v14, 0xc
a=0;// 
a=0;//     .line 831
a=0;//     const-string v15, "</statuscode>"
a=0;// 
a=0;//     invoke-virtual {v7, v15}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 829
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v7, v14, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 832
a=0;//     .local v1, "code":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v14, "CmccOmpUtility"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "sendSocketRequest: return statuscode = "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 833
a=0;//     const-string v14, "8603"
a=0;// 
a=0;//     invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_3
a=0;// 
a=0;//     const-string v14, "8609"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-eqz v14, :cond_4
a=0;// 
a=0;//     .line 834
a=0;//     :cond_3
a=0;//     invoke-static {}, Lcom/cmcc/omp/security/CmccOmpSharedPreferences;->clearAllData()V
a=0;// 
a=0;//     .line 835
a=0;//     const-string v14, "CmccOmpUtility"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "statuscode = "
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 836
a=0;//     const-string v16, ", deviceid or seed is invalid at all."
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 835
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .end local v1    # "code":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .end local v13    # "wr":Ljava/io/BufferedWriter;
a=0;//     .restart local v12    # "wr":Ljava/io/BufferedWriter;
a=0;//     #v12=(Reference,Ljava/io/BufferedWriter;);
a=0;//     move-object v8, v7
a=0;// 
a=0;//     .line 840
a=0;//     .end local v3    # "hostname":Ljava/lang/String;
a=0;//     .end local v5    # "port":I
a=0;//     .end local v6    # "purl":Ljava/net/URL;
a=0;//     .end local v7    # "returnStr":Ljava/lang/String;
a=0;//     .end local v11    # "to":I
a=0;//     .local v8, "returnStr":Ljava/lang/String;
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Reference,Ljava/lang/String;);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .end local v8    # "returnStr":Ljava/lang/String;
a=0;//     .restart local v7    # "returnStr":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Null);v10=(Uninit);v11=(Uninit);v12=(Null);v13=(Uninit);v14=(Reference,Ljava/lang/String;);v16=(LongLo);
a=0;//     move-object v8, v7
a=0;// 
a=0;//     .line 747
a=0;//     .end local v7    # "returnStr":Ljava/lang/String;
a=0;//     .restart local v8    # "returnStr":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 766
a=0;//     .end local v8    # "returnStr":Ljava/lang/String;
a=0;//     .restart local v3    # "hostname":Ljava/lang/String;
a=0;//     .restart local v5    # "port":I
a=0;//     .restart local v6    # "purl":Ljava/net/URL;
a=0;//     .restart local v7    # "returnStr":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Integer);v5=(Integer);v6=(Reference,Ljava/net/URL;);v8=(Uninit);v14=(Boolean);v16=(Reference,Ljava/lang/String;);
a=0;//     new-instance v10, Ljava/net/Socket;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/net/Socket;);
a=0;//     invoke-direct {v10, v3, v5}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .end local v9    # "socket":Ljava/net/Socket;
a=0;//     .restart local v10    # "socket":Ljava/net/Socket;
a=0;//     #v10=(Reference,Ljava/net/Socket;);
a=0;//     move-object v9, v10
a=0;// 
a=0;//     .end local v10    # "socket":Ljava/net/Socket;
a=0;//     .restart local v9    # "socket":Ljava/net/Socket;
a=0;//     #v9=(Reference,Ljava/net/Socket;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 780
a=0;//     .end local v12    # "wr":Ljava/io/BufferedWriter;
a=0;//     .restart local v11    # "to":I
a=0;//     .restart local v13    # "wr":Ljava/io/BufferedWriter;
a=0;//     :cond_7
a=0;//     :try_start_5
a=0;//     #v11=(Integer);v13=(Reference,Ljava/io/BufferedWriter;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "POST "
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, " HTTP/1.1\r\n"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_3
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 798
a=0;//     .end local v7    # "returnStr":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v7=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .line 799
a=0;//     .end local v3    # "hostname":Ljava/lang/String;
a=0;//     .end local v5    # "port":I
a=0;//     .end local v6    # "purl":Ljava/net/URL;
a=0;//     .end local v11    # "to":I
a=0;//     .end local v13    # "wr":Ljava/io/BufferedWriter;
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     .restart local v12    # "wr":Ljava/io/BufferedWriter;
a=0;//     :goto_5
a=0;//     :try_start_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Reference,Ljava/io/BufferedWriter;);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     throw v2
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     .line 800
a=0;//     .end local v2    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 801
a=0;//     :goto_6
a=0;//     #v14=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v12, :cond_8
a=0;// 
a=0;//     .line 803
a=0;//     :try_start_7
a=0;//     invoke-virtual {v12}, Ljava/io/BufferedWriter;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
a=0;// 
a=0;//     .line 808
a=0;//     :cond_8
a=0;//     :goto_7
a=0;//     if-eqz v9, :cond_9
a=0;// 
a=0;//     .line 810
a=0;//     :try_start_8
a=0;//     invoke-virtual {v9}, Ljava/net/Socket;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     .line 814
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 817
a=0;//     :cond_9
a=0;//     :goto_8
a=0;//     throw v14
a=0;// 
a=0;//     .line 804
a=0;//     :catch_1
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 805
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 811
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 812
a=0;//     .restart local v2    # "e":Ljava/io/IOException;
a=0;//     :try_start_9
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     .line 814
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 813
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catchall_1
a=0;//     #v2=(Conflicted);v9=(Reference,Ljava/net/Socket;);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 814
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 815
a=0;//     #v9=(Null);
a=0;//     throw v14
a=0;// 
a=0;//     .line 804
a=0;//     .end local v12    # "wr":Ljava/io/BufferedWriter;
a=0;//     .restart local v3    # "hostname":Ljava/lang/String;
a=0;//     .restart local v5    # "port":I
a=0;//     .restart local v6    # "purl":Ljava/net/URL;
a=0;//     .restart local v7    # "returnStr":Ljava/lang/String;
a=0;//     .restart local v11    # "to":I
a=0;//     .restart local v13    # "wr":Ljava/io/BufferedWriter;
a=0;//     :catch_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Reference,Ljava/lang/String;);v5=(Integer);v6=(Reference,Ljava/net/URL;);v7=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/net/Socket;);v10=(Reference,Ljava/net/Socket;);v11=(Integer);v12=(Null);v13=(Reference,Ljava/io/BufferedWriter;);v15=(Reference,Ljava/lang/String;);v16=(Reference,Ljava/lang/String;);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 805
a=0;//     .restart local v2    # "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 811
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catch_4
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 812
a=0;//     .restart local v2    # "e":Ljava/io/IOException;
a=0;//     :try_start_a
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_a
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_2
a=0;// 
a=0;//     .line 814
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 813
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catchall_2
a=0;//     #v2=(Conflicted);v9=(Reference,Ljava/net/Socket;);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 814
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 815
a=0;//     #v9=(Null);
a=0;//     throw v14
a=0;// 
a=0;//     .line 800
a=0;//     .end local v7    # "returnStr":Ljava/lang/String;
a=0;//     :catchall_3
a=0;//     #v2=(Uninit);v7=(Conflicted);v9=(Reference,Ljava/net/Socket;);v14=(Conflicted);
a=0;//     move-exception v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .end local v13    # "wr":Ljava/io/BufferedWriter;
a=0;//     .restart local v12    # "wr":Ljava/io/BufferedWriter;
a=0;//     #v12=(Reference,Ljava/io/BufferedWriter;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 798
a=0;//     .end local v3    # "hostname":Ljava/lang/String;
a=0;//     .end local v5    # "port":I
a=0;//     .end local v6    # "purl":Ljava/net/URL;
a=0;//     .end local v11    # "to":I
a=0;//     .restart local v7    # "returnStr":Ljava/lang/String;
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/lang/String;);v10=(Conflicted);v11=(Conflicted);v12=(Null);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method protected static setHttpUrlConnOutput(Ljava/net/HttpURLConnection;[B)Z
a=0;//     .locals 3
a=0;//     .param p0, "httpUrlConnection"    # Ljava/net/HttpURLConnection;
a=0;//     .param p1, "httpbody"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 671
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 673
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 674
a=0;//     .local v1, "outputStream":Ljava/io/OutputStream;
a=0;//     #v1=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 675
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 676
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 682
a=0;//     .end local v1    # "outputStream":Ljava/io/OutputStream;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 677
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 678
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 679
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static setHttpUrlConnReqProperty(Ljava/net/HttpURLConnection;Ljava/util/Hashtable;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p0, "httpUrlConnection"    # Ljava/net/HttpURLConnection;
a=0;//     .param p2, "Authorization"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/net/HttpURLConnection;",
a=0;//             "Ljava/util/Hashtable",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 653
a=0;//     .local p1, "httphead":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Object;>;"
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 654
a=0;//     invoke-virtual {p1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 655
a=0;//     .local v0, "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/lang/String;>;"
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Enumeration;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 664
a=0;//     .end local v0    # "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/lang/String;>;"
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 665
a=0;//     const-string v3, "Authorization"
a=0;// 
a=0;//     invoke-virtual {p0, v3, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 666
a=0;//     return-void
a=0;// 
a=0;//     .line 656
a=0;//     .restart local v0    # "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/lang/String;>;"
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/util/Enumeration;);v3=(Boolean);
a=0;//     invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 657
a=0;//     .local v1, "tempElement":Ljava/lang/String;
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "head key:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 658
a=0;//     invoke-virtual {p1, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     .line 659
a=0;//     .local v2, "tempValues":Ljava/lang/String;
a=0;//     const-string v3, "CmccOmpUtility"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "head key:"
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "----head value:"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 660
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 659
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 661
a=0;//     invoke-virtual {p0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
