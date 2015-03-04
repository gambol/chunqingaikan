package mm.purchasesdk; class Purchase { void a() { int a;
a=0;// .class public Lmm/purchasesdk/Purchase;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final TAG:Ljava/lang/String;
a=0;// 
a=0;// .field public static mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;// .field private static mPackageName:Ljava/lang/String;
a=0;// 
a=0;// .field private static mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;// .field private static mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;// .field private static mRamNum:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAppID:Ljava/lang/String;
a=0;// 
a=0;// .field private mAppkey:Ljava/lang/String;
a=0;// 
a=0;// .field private mBound:Ljava/lang/Boolean;
a=0;// 
a=0;// .field private mConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;// .field public mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mCurAction:I
a=0;// 
a=0;// .field private mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;// .field private mFrameworkListener:Lmm/purchasesdk/d;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field public mIPAPackageName:Ljava/lang/String;
a=0;// 
a=0;// .field public mIPAServiceAction:Ljava/lang/String;
a=0;// 
a=0;// .field private mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;// .field private mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;// .field private mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;// .field private mMessengerToService:Landroid/os/Messenger;
a=0;// 
a=0;// .field private mNextCycle:Z
a=0;// 
a=0;// .field private mPaycode:Ljava/lang/String;
a=0;// 
a=0;// .field private mReturnData:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     const-class v0, Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     iput-object v1, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     const-string v0, "ipa.ability"
a=0;// 
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mIPAPackageName:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "com.aspire.purchaseservice.BIND"
a=0;// 
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mIPAServiceAction:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lmm/purchasesdk/Purchase;->mAppkey:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lmm/purchasesdk/Purchase;->mAppID:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/b;);
a=0;//     invoke-direct {v0, p0}, Lmm/purchasesdk/b;-><init>(Lmm/purchasesdk/Purchase;)V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/b;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/c;);
a=0;//     invoke-direct {v0, p0}, Lmm/purchasesdk/c;-><init>(Lmm/purchasesdk/Purchase;)V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/c;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$002(Lmm/purchasesdk/Purchase;Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100()Lmm/purchasesdk/core/IPurchase;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1002(Lmm/purchasesdk/Purchase;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/Purchase;->mMessengerToService:Landroid/os/Messenger;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1100(Lmm/purchasesdk/Purchase;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/OnPurchaseListener;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Lmm/purchasesdk/Purchase;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct/range {p0 .. p6}, Lmm/purchasesdk/Purchase;->orders2w(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Lmm/purchasesdk/Purchase;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lmm/purchasesdk/Purchase;->bill(Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Lmm/purchasesdk/Purchase;I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lmm/purchasesdk/Purchase;->createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$602(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 0
a=0;// 
a=0;//     sput-object p0, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Lmm/purchasesdk/Purchase;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lmm/purchasesdk/Purchase;->mCurAction:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$802(Lmm/purchasesdk/Purchase;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/Purchase;->mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$902(Lmm/purchasesdk/Purchase;Ljava/lang/Boolean;)Ljava/lang/Boolean;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/Purchase;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private bill(Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, v0}, Lmm/purchasesdk/Purchase;->sendMessage(Lmm/purchasesdk/core/protocol/MessengerInfo;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkAuth(Landroid/content/Context;Ljava/util/HashMap;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAuthstr()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     invoke-interface {v0, p1}, Lmm/purchasesdk/core/IPurchase;->readImsi(Landroid/content/Context;)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getCopyrightCert()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v5=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Lmm/purchasesdk/core/IPurchase;->checkAuth(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     const/16 v1, 0x68
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosByte);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     move v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private checkService(Landroid/content/Context;Landroid/os/Handler;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getProgramID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "100000000000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/sdk/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/sdk/i;);
a=0;//     invoke-direct {v0, p1, p2}, Lmm/purchasesdk/sdk/i;-><init>(Landroid/content/Context;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/sdk/i;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/i;->start()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "createInfo reqType = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getChannelID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getProgramID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getCopyrightCert()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v3, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gtz v4, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v4=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-interface {v0, v3, v4}, Lmm/purchasesdk/core/IPurchase;->loadCopyright(Landroid/content/Context;Lmm/purchasesdk/core/protocol/MessengerInfo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setResult(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Reference,Landroid/content/Context;);v4=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);v5=(One);v6=(Uninit);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     const-string v4, "Cert"
a=0;// 
a=0;//     invoke-interface {v0, v4}, Lmm/purchasesdk/core/IPurchase;->getCopyrightInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setCopyrightCert(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gtz v4, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     const-string v4, "ProgramID"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v4}, Lmm/purchasesdk/core/IPurchase;->getCopyrightInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setProgramID(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_5
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v4=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->isPaycodeStyle()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v5, v4, :cond_8
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne p1, v4, :cond_8
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v4=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-static {v3, v4}, Lmm/purchasesdk/sdk/a;->a(Landroid/content/Context;Lmm/purchasesdk/core/protocol/MessengerInfo;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     sget-object v4, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "mInfo.getChannelID() = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v6}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getChannelID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/core/PurchaseCode;->getStatusCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sget-object v4, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "checkAuth retcode = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPurchasecode(I)V
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v3, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v3=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->SHA1Digest()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setClasseSha1(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v3, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setChannelID(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setCopyrightCert(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getProgramID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getProgramID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getProgramID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setProgramID(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPackageName(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-long/2addr v0, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Long;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Long;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setTimeStamp(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lmm/purchasesdk/Purchase;->setTaskID(Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Landroid/content/Context;);v4=(Integer);v5=(One);v6=(Uninit);
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gtz v4, :cond_b
a=0;// 
a=0;//     :cond_9
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-static {v3, v2}, Lmm/purchasesdk/sdk/a;->a(Landroid/content/Context;Lmm/purchasesdk/core/protocol/MessengerInfo;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     const/16 v0, 0xc8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setResult(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     iget-object v3, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setChannelID(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_b
a=0;//     iget-object v3, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->isPaycodeStyle()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v5, v3, :cond_6
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     const-string v3, "ProgramID"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v3}, Lmm/purchasesdk/core/IPurchase;->getCopyrightInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setProgramID(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Null);v4=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private dyQuest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "dyQuestion-->"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-interface {v0, v1}, Lmm/purchasesdk/core/IPurchase;->SetIsNeedDyquestion(Z)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Lmm/purchasesdk/core/IPurchase;->getDyQuestion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, v1}, Lmm/purchasesdk/core/IPurchase;->SetIsNeedDyquestion(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getDescription(I)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Lmm/purchasesdk/core/PurchaseCode;->getDescription(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lmm/purchasesdk/Purchase;
a=0;//     .locals 4
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/Purchase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Math;->random()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide/high16 v2, 0x4024000000000000L    # 10.0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     const-wide/high16 v2, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     add-double/2addr v0, v2
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mRamNum:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getPurchseCore(Landroid/content/Context;)Lmm/purchasesdk/core/IPurchase;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getPurchseCore(Landroid/content/Context;)Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getReason(I)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Lmm/purchasesdk/core/PurchaseCode;->getReason(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private orders2w(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "enter orders2w"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setOrderCount(I)V
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lmm/purchasesdk/Purchase;->createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Lmm/purchasesdk/Purchase;->sendMessage(Lmm/purchasesdk/core/protocol/MessengerInfo;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTaskID(Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getTaskId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setTaskID(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "Purchase"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "task id="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bind(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mIPAServiceAction:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".purchaseservice.BIND"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "start service, mPackageName:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "start service:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lmm/purchasesdk/Purchase;->mConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "start service "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " ret= true"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "start service "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, " ret = false"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mIPAServiceAction:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "start service "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mIPAServiceAction:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " ret= true"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "start service "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mIPAServiceAction:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " ret= false"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clearCache(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Context Object is null or Context Object is not instance of Activity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public enableCache(Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     invoke-interface {v0, p1}, Lmm/purchasesdk/core/IPurchase;->enableCache(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getCurAction()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lmm/purchasesdk/Purchase;->mCurAction:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPackageName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSDKVersion(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Context Object is null or Context Object is not instance of Activity"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     invoke-interface {v0, p1}, Lmm/purchasesdk/core/IPurchase;->getSDKVersion(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public init(Landroid/content/Context;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lmm/purchasesdk/Purchase;->getPurchseCore(Landroid/content/Context;)Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "load class failture!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "load class failture!"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "load class succ!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_2
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     instance-of v0, p1, Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Context Object is null or Context Object is not instance of Activity"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const-string v0, "\u5c0a\u656c\u7684\u7528\u6237\uff0c\u5df2\u6709\u652f\u4ed8\u8bf7\u6c42\u6b63\u5728\u53d1\u9001"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     if-nez p2, :cond_6
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "OnPurchaseListener Object is null!"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_6
a=0;//     iput-object p2, p0, Lmm/purchasesdk/Purchase;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mAppID:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mAppkey:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, p1, v1, v2}, Lmm/purchasesdk/core/IPurchase;->checkEnvironment(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "appid or appkey is null!!!! "
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_0
a=0;//     #v0=(Integer);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "init try file iapsplash.dat"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "iapSplash.dat"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     iput v4, p0, Lmm/purchasesdk/Purchase;->mCurAction:I
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lmm/purchasesdk/Purchase;->createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     const-string v0, "init MessengerInfo"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "init time"
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTimeStamp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lmm/purchasesdk/Purchase;->setTaskID(Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lmm/purchasesdk/Purchase;->bind(Landroid/content/Context;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "init catch file iapsplash.dat"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0, p1, v1}, Lmm/purchasesdk/core/IPurchase;->showSplashDialog(Landroid/content/Context;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     const-string v0, "iapSplash.dat"
a=0;// 
a=0;//     invoke-virtual {p1, v0, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/FileOutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public order(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move v5, p5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     move-object v6, p6
a=0;// 
a=0;//     #v6=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     move-object v8, v7
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual/range {v0 .. v8}, Lmm/purchasesdk/Purchase;->order(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public order(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lmm/purchasesdk/Purchase;->getPurchseCore(Landroid/content/Context;)Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "load class failture!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "load class failture!"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "load class succ!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :goto_0
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Context Object is null or Context Object is not instance of Activity"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setMessage(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object p1, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const-string v0, "\u5c0a\u656c\u7684\u7528\u6237\uff0c\u5df2\u6709\u652f\u4ed8\u8bf7\u6c42\u6b63\u5728\u53d1\u9001"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     if-nez p6, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "OnPurchaseListener Object is null!"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_5
a=0;//     iput-object p6, p0, Lmm/purchasesdk/Purchase;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     if-eqz p2, :cond_6
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Error! Paycode is null!"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0, p2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPaycode(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-static {p1}, Lmm/purchasesdk/sdk/h;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setApksignture(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {p7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     invoke-static {p8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setAppType(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, p7}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setAppUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, p8}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setRefleshUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_2
a=0;//     if-gtz p3, :cond_9
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "orderCout must be greater than 0 "
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setAppType(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_9
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setOrderCount(I)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAppID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v2=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAppKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v3=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0, v1, v2, v3}, Lmm/purchasesdk/core/IPurchase;->checkPayCodeType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_c
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPaycodeStyle(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setOrderCount(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     const/16 v2, 0x66
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPurchasecode(I)V
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Lmm/purchasesdk/Purchase;->createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Conflicted);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "paycodetpye = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->isPaycodeStyle()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "paycodeStyle = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     if-nez v0, :cond_10
a=0;// 
a=0;//     if-eqz p4, :cond_a
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_a
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v1, p4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setUserData(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_a
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mAppID:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lmm/purchasesdk/Purchase;->mAppkey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1, p1, v2, v3, v0}, Lmm/purchasesdk/core/IPurchase;->checkEnvironment(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v2, v0, :cond_b
a=0;// 
a=0;//     const/16 v0, 0x451
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-ne v1, v0, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPurchasecode(I)V
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "checkEnvironment retcode ="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     sget v1, Lmm/purchasesdk/core/utils/LogUtil;->LOG_ON_LEVEL:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, p1, v1}, Lmm/purchasesdk/core/IPurchase;->init(Landroid/content/Context;I)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->SHA1Digest()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setApkSHA(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getSignature()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setApkPKI(Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lmm/purchasesdk/Purchase;->mCurAction:I
a=0;// 
a=0;//     new-instance v0, Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     invoke-direct {v0, p1}, Lsafiap/framework/sdk/SAFFramework;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->isPaycodeStyle()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez v1, :cond_14
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAppID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1, p2}, Lmm/purchasesdk/core/IPurchase;->generateTransactionID(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v6, v0
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setTradeID(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, p5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setNextCycle(Z)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "order mInfo.getPurchasecode() ="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPurchasecode()I
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
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v5, Lmm/purchasesdk/a;
a=0;// 
a=0;//     #v5=(UninitRef,Lmm/purchasesdk/a;);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-direct {v5, p0, v0}, Lmm/purchasesdk/a;-><init>(Lmm/purchasesdk/Purchase;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     #v5=(Reference,Lmm/purchasesdk/a;);
a=0;//     new-instance v0, Lmm/purchasesdk/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/d;);
a=0;//     iget-object v4, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     move-object v3, p6
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lmm/purchasesdk/d;-><init>(Landroid/content/Context;Lmm/purchasesdk/Purchase;Lmm/purchasesdk/OnPurchaseListener;Lsafiap/framework/sdk/SAFFramework;Lmm/purchasesdk/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/d;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mFrameworkListener:Lmm/purchasesdk/d;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     sget-boolean v0, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_13
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mFrameworkListener:Lmm/purchasesdk/d;
a=0;// 
a=0;//     const-string v2, "test"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lsafiap/framework/sdk/SAFFramework;->init(Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-direct {p0, p1, v0, v1}, Lmm/purchasesdk/Purchase;->checkService(Landroid/content/Context;Landroid/os/Handler;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Integer);v1=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-nez v0, :cond_d
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPaycodeStyle(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setOrderCount(I)V
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Lmm/purchasesdk/Purchase;->createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(One);v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Lmm/purchasesdk/Purchase;->createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-static {p1, v1}, Lmm/purchasesdk/sdk/a;->a(Landroid/content/Context;Lmm/purchasesdk/core/protocol/MessengerInfo;)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     sget-object v2, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\tpaycodetpye = -1 ret ="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz v1, :cond_e
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPaycodeStyle(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setOrderCount(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     const/16 v2, 0x66
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPurchasecode(I)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_e
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v1, 0x4b9
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {}, Lmm/purchasesdk/core/PurchaseCode;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_f
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPaycodeStyle(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/core/PurchaseCode;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPurchasecode(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setOrderCount(I)V
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Lmm/purchasesdk/Purchase;->createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_f
a=0;//     #v1=(PosShort);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPaycodeStyle(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/core/PurchaseCode;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPurchasecode(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setOrderCount(I)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_10
a=0;//     #v2=(Reference,Ljava/lang/String;);v4=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_a
a=0;// 
a=0;//     if-eqz p4, :cond_11
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_11
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "data Error! UserData\'s length must be less than 16.You have input "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " bytes"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_11
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);
a=0;//     if-nez p4, :cond_12
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setUserData(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_12
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v1, p4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setUserData(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_13
a=0;//     #v0=(Conflicted);v2=(Reference,Lmm/purchasesdk/Purchase;);v4=(Reference,Lsafiap/framework/sdk/SAFFramework;);v5=(Reference,Lmm/purchasesdk/a;);v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1}, Lmm/purchasesdk/Purchase;->bind(Landroid/content/Context;)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_14
a=0;//     #v0=(Null);v1=(Integer);v4=(Conflicted);v5=(Uninit);v6=(Uninit);
a=0;//     move-object v6, v0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public order(Landroid/content/Context;Ljava/lang/String;ILmm/purchasesdk/OnPurchaseListener;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lmm/purchasesdk/Purchase;->order(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public order(Landroid/content/Context;Ljava/lang/String;IZLmm/purchasesdk/OnPurchaseListener;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v5, p4
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lmm/purchasesdk/Purchase;->order(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public order(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p3
a=0;// 
a=0;//     #v6=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lmm/purchasesdk/Purchase;->order(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public query(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lmm/purchasesdk/Purchase;->getPurchseCore(Landroid/content/Context;)Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "load class failture!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "load class failture!"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "load class succ!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_2
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Context Object is null or Context Object is not instance of Activity"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const-string v0, "\u5c0a\u656c\u7684\u7528\u6237\uff0c\u5df2\u6709\u652f\u4ed8\u8bf7\u6c42\u6b63\u5728\u53d1\u9001"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Lmm/purchasesdk/OnPurchaseListener;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Null);v4=(One);v5=(Uninit);
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     if-nez p4, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "OnPurchaseListener Object is null!"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_5
a=0;//     iput-object p4, p0, Lmm/purchasesdk/Purchase;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     if-eqz p2, :cond_6
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Error! Paycode is null!"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0, p2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPaycode(Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz p3, :cond_8
a=0;// 
a=0;//     invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0, p3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setTradeID(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setTradeIDQuery(Z)V
a=0;// 
a=0;//     :goto_1
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mAppID:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mAppkey:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, p1, v1, v2}, Lmm/purchasesdk/core/IPurchase;->checkEnvironment(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "appid or appkey is null!!!! "
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setTradeID(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setTradeIDQuery(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lmm/purchasesdk/Purchase;->mCurAction:I
a=0;// 
a=0;//     new-instance v0, Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     invoke-direct {v0, p1}, Lsafiap/framework/sdk/SAFFramework;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     invoke-direct {p0, v4}, Lmm/purchasesdk/Purchase;->createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lmm/purchasesdk/Purchase;->setTaskID(Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     new-instance v5, Lmm/purchasesdk/a;
a=0;// 
a=0;//     #v5=(UninitRef,Lmm/purchasesdk/a;);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-direct {v5, p0, v0}, Lmm/purchasesdk/a;-><init>(Lmm/purchasesdk/Purchase;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     #v5=(Reference,Lmm/purchasesdk/a;);
a=0;//     new-instance v0, Lmm/purchasesdk/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/d;);
a=0;//     iget-object v4, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p0
a=0;// 
a=0;//     move-object v3, p4
a=0;// 
a=0;//     #v3=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lmm/purchasesdk/d;-><init>(Landroid/content/Context;Lmm/purchasesdk/Purchase;Lmm/purchasesdk/OnPurchaseListener;Lsafiap/framework/sdk/SAFFramework;Lmm/purchasesdk/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/d;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mFrameworkListener:Lmm/purchasesdk/d;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     sget-boolean v0, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_a
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mFrameworkListener:Lmm/purchasesdk/d;
a=0;// 
a=0;//     const-string v2, "test"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lsafiap/framework/sdk/SAFFramework;->init(Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Lmm/purchasesdk/Purchase;->bind(Landroid/content/Context;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public query(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0, p3}, Lmm/purchasesdk/Purchase;->query(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public queryPackageName()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1, v2, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->writeToBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mMessengerToService:Landroid/os/Messenger;
a=0;// 
a=0;//     iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Messenger;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lmm/purchasesdk/Purchase;->bind(Landroid/content/Context;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/os/Messenger;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "\u53d1\u9001\u6d88\u606f\u5230service\uff1aIPurchase.MSG_PACKAGENAME"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sendMessage(Lmm/purchasesdk/core/protocol/MessengerInfo;I)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p2, v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAppID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAppKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTimeStamp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3, v5}, Lmm/purchasesdk/fingerprint/IdentifyApp;->IdTokenEncrypt(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setIDToken(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {v5, p2, v4, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->writeToBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mMessengerToService:Landroid/os/Messenger;
a=0;// 
a=0;//     iput-object v1, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Messenger;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lmm/purchasesdk/Purchase;->bind(Landroid/content/Context;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/os/Messenger;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAppInfo(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "invalid app parameter, pls check it"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-static {}, Lmm/purchasesdk/core/utils/LogUtil;->readDebugConfig()V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_2
a=0;//     iput-object p1, p0, Lmm/purchasesdk/Purchase;->mAppID:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lmm/purchasesdk/Purchase;->mAppkey:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setAppID(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setAppKey(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCurAction(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lmm/purchasesdk/Purchase;->mCurAction:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPackageName(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput-object p1, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTimeout(II)V
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     invoke-interface {v0, p1, p2}, Lmm/purchasesdk/core/IPurchase;->setTimeout(II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startOrder(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ".com.mmiap.activity"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lmm/purchasesdk/Purchase;->mPackageName:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".com.mmiap.activity"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public unBind()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ServiceConnection;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iput-object v4, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     :cond_1
a=0;//     sput-boolean v3, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     iput-object v4, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "Purchase"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "unbind failed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iput-object v4, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     :cond_3
a=0;//     sput-boolean v3, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     iput-object v4, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     invoke-virtual {v1}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iput-object v4, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     :cond_5
a=0;//     sput-boolean v3, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lmm/purchasesdk/Purchase;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     iput-object v4, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     :cond_7
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     iput-object v4, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     :cond_8
a=0;//     sput-boolean v3, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     iput-object v4, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public unsubscribe(Landroid/content/Context;Ljava/lang/String;Lmm/purchasesdk/OnPurchaseListener;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lmm/purchasesdk/Purchase;->getPurchseCore(Landroid/content/Context;)Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "load class failture!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "load class failture!"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "load class succ!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     instance-of v0, p1, Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Context Object is null"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const-string v0, "\u5c0a\u656c\u7684\u7528\u6237\uff0c\u5df2\u6709\u652f\u4ed8\u8bf7\u6c42\u6b63\u5728\u53d1\u9001"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Lmm/purchasesdk/OnPurchaseListener;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     if-nez p3, :cond_5
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "OnPurchaseListener Object is null"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_5
a=0;//     iput-object p3, p0, Lmm/purchasesdk/Purchase;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     if-eqz p2, :cond_6
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Paycode is null"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mAppID:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/Purchase;->mAppkey:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, p1, v1, v2}, Lmm/purchasesdk/core/IPurchase;->checkEnvironment(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     sput-object v0, Lmm/purchasesdk/Purchase;->mLocked:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "appid or appkey is null!!!! "
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0, p2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPaycode(Ljava/lang/String;)V
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lmm/purchasesdk/Purchase;->mCurAction:I
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAppID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1, p2}, Lmm/purchasesdk/core/IPurchase;->generateTransactionID(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setTradeID(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     invoke-direct {v0, p1}, Lsafiap/framework/sdk/SAFFramework;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lmm/purchasesdk/Purchase;->createInfo(I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {p0, v0}, Lmm/purchasesdk/Purchase;->setTaskID(Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     new-instance v5, Lmm/purchasesdk/a;
a=0;// 
a=0;//     #v5=(UninitRef,Lmm/purchasesdk/a;);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-direct {v5, p0, v0}, Lmm/purchasesdk/a;-><init>(Lmm/purchasesdk/Purchase;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     #v5=(Reference,Lmm/purchasesdk/a;);
a=0;//     new-instance v0, Lmm/purchasesdk/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/d;);
a=0;//     iget-object v4, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p0
a=0;// 
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lmm/purchasesdk/d;-><init>(Landroid/content/Context;Lmm/purchasesdk/Purchase;Lmm/purchasesdk/OnPurchaseListener;Lsafiap/framework/sdk/SAFFramework;Lmm/purchasesdk/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/d;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/Purchase;->mFrameworkListener:Lmm/purchasesdk/d;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     sget-boolean v0, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_9
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/Purchase;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/Purchase;->mFrameworkListener:Lmm/purchasesdk/d;
a=0;// 
a=0;//     const-string v2, "test"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lsafiap/framework/sdk/SAFFramework;->init(Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Lmm/purchasesdk/Purchase;->bind(Landroid/content/Context;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
