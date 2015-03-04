package mm.purchasesdk.core; class IPurchase { void a() { int a;
a=0;// .class public interface abstract Lmm/purchasesdk/core/IPurchase;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final FINGERPRINT_COMPUTING:I = -0x6
a=0;// 
a=0;// .field public static final FINGERPRINT_DATA_ERROR:I = -0x7
a=0;// 
a=0;// .field public static final FINGERPRINT_FILE_ERROR:I = -0x3
a=0;// 
a=0;// .field public static final FINGERPRINT_INIT_FAILED:I = -0x1
a=0;// 
a=0;// .field public static final FINGERPRINT_PARAM_ERROR:I = -0x2
a=0;// 
a=0;// .field public static final FINGERPRINT_SF_INVALID:I = -0x4
a=0;// 
a=0;// .field public static final FINGERPRINT_SUCCESS:I = 0x0
a=0;// 
a=0;// .field public static final FINGERPRINT_THREAD_ERROR:I = -0x5
a=0;// 
a=0;// .field public static final GET_APP_INFO:I = 0x7
a=0;// 
a=0;// .field public static final INIT_REQUEST:I = 0x0
a=0;// 
a=0;// .field public static final MESSAGE:Ljava/lang/String; = "\u5c0a\u656c\u7684\u7528\u6237\uff0c\u5df2\u6709\u652f\u4ed8\u8bf7\u6c42\u6b63\u5728\u53d1\u9001"
a=0;// 
a=0;// .field public static final MSG_AUTH:I = 0x2
a=0;// 
a=0;// .field public static final MSG_BILL:I = 0x3
a=0;// 
a=0;// .field public static final MSG_BILLFINISH:I = 0x7
a=0;// 
a=0;// .field public static final MSG_BILL_WEAK:I = 0xb
a=0;// 
a=0;// .field public static final MSG_FINGERPRINT_COMPUTING:I = 0xa
a=0;// 
a=0;// .field public static final MSG_INIT:I = 0x1
a=0;// 
a=0;// .field public static final MSG_PACKAGENAME:I = 0x9
a=0;// 
a=0;// .field public static final MSG_QUERST:I = 0x6
a=0;// 
a=0;// .field public static final MSG_QUERY:I = 0x4
a=0;// 
a=0;// .field public static final MSG_SINGLEINSTANCE:I = 0x8
a=0;// 
a=0;// .field public static final MSG_UNSUB:I = 0x5
a=0;// 
a=0;// .field public static final NOCHANGE_PAYCODE:I = 0x0
a=0;// 
a=0;// .field public static final NONE_REQUEST:I = -0x1
a=0;// 
a=0;// .field public static final ORDER_FINISH:I = 0x5
a=0;// 
a=0;// .field public static final ORDER_REQUEST:I = 0x2
a=0;// 
a=0;// .field public static final PAD_CERT_DIALOG:I = 0x6
a=0;// 
a=0;// .field public static final PRIORITY:Ljava/lang/String; = "240"
a=0;// 
a=0;// .field public static final PRIORITY_ERR:I = 0x8
a=0;// 
a=0;// .field public static final QUERY_PACKAGE:I = 0x9
a=0;// 
a=0;// .field public static final QUERY_REQUEST:I = 0x1
a=0;// 
a=0;// .field public static final REFRESH_CHECKCODE:I = 0x4
a=0;// 
a=0;// .field public static final STRONGTOWEAK_PAYCODE:I = 0x1
a=0;// 
a=0;// .field public static final STRONG_PAYCODE:I = 0x0
a=0;// 
a=0;// .field public static final UNKNOWN_PAYCODE:I = -0x1
a=0;// 
a=0;// .field public static final UNSUB_REQUEST:I = 0x3
a=0;// 
a=0;// .field public static final WEAKTOSTRONG_PAYCODE:I = 0x2
a=0;// 
a=0;// .field public static final WEAK_PAYCODE:I = 0x1
a=0;// 
a=0;// .field public static final mBracketID:Ljava/lang/String; = "399900002500"
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract RestartDialogs(Landroid/content/Context;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract SetIsNeedDyquestion(Z)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract StartDyQuestThread(Lmm/purchasesdk/core/protocol/MessengerInfo;Landroid/os/Handler;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract checkAuth(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)I
a=0;// .end method
a=0;// 
a=0;// .method public abstract checkEnvironment(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;// .end method
a=0;// 
a=0;// .method public abstract checkEnvironment(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I
a=0;// .end method
a=0;// 
a=0;// .method public abstract checkPayCodeType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// .end method
a=0;// 
a=0;// .method public abstract clearCache(Landroid/content/Context;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract enableCache(Z)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract generateTransactionID(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract generateTransactionID(Lmm/purchasesdk/core/protocol/MessengerInfo;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getChannelID(Landroid/content/Context;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getCopyrightInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getDyAnswer()Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getDyQuestion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract getPackageName(Landroid/content/Context;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getSDKVersion(Landroid/content/Context;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getStaticMark(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getStatus()I
a=0;// .end method
a=0;// 
a=0;// .method public abstract init(Landroid/content/Context;I)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract loadCopyright(Landroid/content/Context;Lmm/purchasesdk/core/protocol/MessengerInfo;)I
a=0;// .end method
a=0;// 
a=0;// .method public abstract onActivityResultSendMessage(I)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract readImsi(Landroid/content/Context;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract resetParams1()V
a=0;// .end method
a=0;// 
a=0;// .method public abstract service_bill(Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract service_init(Landroid/content/Context;Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract service_order(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/core/protocol/MessengerInfo;Landroid/os/Messenger;Landroid/os/Messenger;)Ljava/lang/String;
a=0;// .end method
a=0;// 
a=0;// .method public abstract service_query(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract service_unsubscribe(Landroid/content/Context;Ljava/lang/String;Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract service_weak_bill(Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;Landroid/os/Messenger;Landroid/os/Messenger;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setAppInfo(Ljava/lang/String;Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setClasseSha1(Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setMessage(Landroid/os/Message;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setMessenger(Landroid/os/Messenger;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract setTimeout(II)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract showProgressDialog(Landroid/content/Context;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract showSplashDialog(Landroid/content/Context;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// .end method
}}
