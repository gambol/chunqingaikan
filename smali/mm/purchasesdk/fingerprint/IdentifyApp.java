package mm.purchasesdk.fingerprint; class IdentifyApp { void a() { int a;
a=0;// .class public Lmm/purchasesdk/fingerprint/IdentifyApp;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final COMPUTING:I = -0x6
a=0;// 
a=0;// .field public static final DATA_ERROR:I = -0x7
a=0;// 
a=0;// .field public static final FILE_IO:I = -0x3
a=0;// 
a=0;// .field public static final NOT_INITED:I = -0x1
a=0;// 
a=0;// .field public static final NO_ERROR:I = 0x0
a=0;// 
a=0;// .field public static final PARAM_INVALID:I = -0x2
a=0;// 
a=0;// .field public static final SF_NOT_FOUND:I = -0x4
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "IdentifyApp"
a=0;// 
a=0;// .field public static final THREAD_ERROR:I = -0x5
a=0;// 
a=0;// .field private static mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "identifyapp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lmm/purchasesdk/fingerprint/IdentifyApp;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "IdentifyApp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "loadLibrary faile"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/fingerprint/IdentifyApp;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static native IdTokenDecrypt([B)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native IdTokenEncrypt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native IdTokenMd5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native IdTokenMd5L([B)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native IdTokenService([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native SHA1Digest()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native SMSOrderContent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native base64decode(Ljava/lang/String;)[B
a=0;// .end method
a=0;// 
a=0;// .method public static native base64encode([B)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native checkResponse([B[B[B)I
a=0;// .end method
a=0;// 
a=0;// .method public static native checkSignature(Ljava/lang/String;)I
a=0;// .end method
a=0;// 
a=0;// .method public static native contentEncrypt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native decrypt([BLjava/lang/String;)[B
a=0;// .end method
a=0;// 
a=0;// .method public static native decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native deletelib(Landroid/content/Context;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native desdecrypt([BLjava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native desencrypt([BLjava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native enccontent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native enccontentuicom(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native encrypt([BLjava/lang/String;)[B
a=0;// .end method
a=0;// 
a=0;// .method public static native encryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native encryptPassword(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static synchronized native declared-synchronized gatherAppSignature(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// .end method
a=0;// 
a=0;// .method public static native generateTransactionID(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native generateWeakTransactionID(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native getAppSignature()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native getAppTrustInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native getKeymap()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native getLastError()I
a=0;// .end method
a=0;// 
a=0;// .method public static getPurchseCore()Lmm/purchasesdk/core/IPurchase;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/fingerprint/IdentifyApp;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getPurchseCore(Landroid/content/Context;)Lmm/purchasesdk/core/IPurchase;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/fingerprint/IdentifyApp;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-static {p0, v0}, Lmm/purchasesdk/fingerprint/IdentifyApp;->load(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/fingerprint/IdentifyApp;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lmm/purchasesdk/fingerprint/IdentifyApp;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "IdentifyApp"
a=0;// 
a=0;//     const-string v1, "load class failture!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     sget-object v0, Lmm/purchasesdk/fingerprint/IdentifyApp;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     const-string v0, "IdentifyApp"
a=0;// 
a=0;//     const-string v1, "load class succ!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static native getSignature()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native getcontent()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native getrandomnum()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native getrid()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native gsmdecode(Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native gsmencode(Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native init(Ljava/lang/Object;Ljava/lang/String;I)Z
a=0;// .end method
a=0;// 
a=0;// .method public static native load(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
a=0;// .end method
a=0;// 
a=0;// .method public static loadClass(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lmm/purchasesdk/core/IPurchase;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v0, "yyyy-MM-dd HH:mm:ss.SSS"
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v0, Ljava/util/Date;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v0}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     const-string v3, "IdentifyApp"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "begin loadClass------------------------------------date: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/util/Date;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v4}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v2, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     new-instance v4, Ldalvik/system/DexClassLoader;
a=0;// 
a=0;//     #v4=(UninitRef,Ldalvik/system/DexClassLoader;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/ClassLoader;);
a=0;//     invoke-direct {v4, v5, v0, v1, v6}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ldalvik/system/DexClassLoader;);
a=0;//     const-string v0, "mm.purchasesdk.core.Purchase"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/core/IPurchase;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v1}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v2, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "IdentifyApp"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "end loadClass------------------------------------date: "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_1
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static native loadlib(Landroid/content/Context;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native md5([B)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native plaincontent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public static native prepareLoad(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
}}
