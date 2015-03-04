package mm.purchasesdk.core.utils; class LogUtil { void a() { int a;
a=0;// .class public Lmm/purchasesdk/core/utils/LogUtil;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/reflect/InvocationHandler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DEBUG_LEVEL:I = 0x0
a=0;// 
a=0;// .field public static final ERROR_LEVEL:I = 0x2
a=0;// 
a=0;// .field protected static final LOG_ON:Z = true
a=0;// 
a=0;// .field public static LOG_ON_LEVEL:I = 0x0
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String;
a=0;// 
a=0;// .field public static final WARN_LEVEL:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private object:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, Lmm/purchasesdk/core/utils/LogUtil;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/core/utils/LogUtil;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput v0, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/core/utils/LogUtil;);
a=0;//     iput-object p1, p0, Lmm/purchasesdk/core/utils/LogUtil;->object:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0, p0, p1}, Lmm/purchasesdk/core/utils/LogUtil;->printLog(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0, p0, p1, p2}, Lmm/purchasesdk/core/utils/LogUtil;->printLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static e(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0, p0, p1}, Lmm/purchasesdk/core/utils/LogUtil;->printLog(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0, p0, p1, p2}, Lmm/purchasesdk/core/utils/LogUtil;->printLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static printLog(ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget v0, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p0, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-static {p1, p2}, Lmm/purchasesdk/core/utils/LogWatcher;->log(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-static {p1, p2}, Lmm/purchasesdk/core/utils/LogWatcher;->log(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-static {p1, p2}, Lmm/purchasesdk/core/utils/LogWatcher;->log(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-static {p1, p2}, Lmm/purchasesdk/core/utils/LogWatcher;->log(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static printLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget v0, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p0, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-static {p1, p2}, Lmm/purchasesdk/core/utils/LogWatcher;->log(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-static {p1, p2}, Lmm/purchasesdk/core/utils/LogWatcher;->log(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-static {p1, p2}, Lmm/purchasesdk/core/utils/LogWatcher;->log(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     invoke-static {p1, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     invoke-static {p1, p2}, Lmm/purchasesdk/core/utils/LogWatcher;->log(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static readDebugConfig()V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/InAppBillingLibrary/IAPConfig"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     new-instance v1, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStreamReader;);
a=0;//     new-instance v3, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/io/BufferedReader;);v4=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Integer;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     sput v5, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     sput v5, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     sput v5, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/io/File;);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     sput v5, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v2=(Reference,Ljava/io/FileInputStream;);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     sput v5, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static w(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0, p0, p1}, Lmm/purchasesdk/core/utils/LogUtil;->printLog(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0, p0, p1, p2}, Lmm/purchasesdk/core/utils/LogUtil;->printLog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "PurchaseListener"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lmm/purchasesdk/core/utils/LogUtil;->printLog(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/utils/LogUtil;->object:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p2, v0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
