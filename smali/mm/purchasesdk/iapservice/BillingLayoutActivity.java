package mm.purchasesdk.iapservice; class BillingLayoutActivity { void a() { int a;
a=0;// .class public Lmm/purchasesdk/iapservice/BillingLayoutActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lmm/purchasesdk/iapservice/BillingLayoutActivity$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static TAG:Ljava/lang/String;
a=0;// 
a=0;// .field public static a:Lmm/purchasesdk/iapservice/BillingLayoutActivity;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mBound:Ljava/lang/Boolean;
a=0;// 
a=0;// .field private mConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;// .field private mIPAServiceAction:Ljava/lang/String;
a=0;// 
a=0;// .field private mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;// .field private mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;// .field private mMessengerToService:Landroid/os/Messenger;
a=0;// 
a=0;// .field private mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "ap BillingLayoutActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/iapservice/BillingLayoutActivity;);
a=0;//     const-string v0, "com.aspire.purchaseservice.BIND"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mIPAServiceAction:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/iapservice/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/iapservice/a;);
a=0;//     invoke-direct {v0, p0}, Lmm/purchasesdk/iapservice/a;-><init>(Lmm/purchasesdk/iapservice/BillingLayoutActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/a;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lmm/purchasesdk/iapservice/BillingLayoutActivity;)Landroid/os/Messenger;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Messenger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lmm/purchasesdk/iapservice/BillingLayoutActivity;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lmm/purchasesdk/iapservice/BillingLayoutActivity;Ljava/lang/Boolean;)Ljava/lang/Boolean;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lmm/purchasesdk/iapservice/BillingLayoutActivity;)Lmm/purchasesdk/core/IPurchase;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lmm/purchasesdk/iapservice/BillingLayoutActivity;Lmm/purchasesdk/core/IPurchase;)Lmm/purchasesdk/core/IPurchase;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 9
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
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
a=0;//     iput-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "\u52a8\u6001\u52a0\u8f7d\u5931\u8d25\u8fd4\u56denull"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getUserData()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->ismNextCycle()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iget-object v6, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v6=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iget-object v7, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mMessengerFromService:Landroid/os/Messenger;
a=0;// 
a=0;//     #v7=(Reference,Landroid/os/Messenger;);
a=0;//     iget-object v8, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mMessengerToService:Landroid/os/Messenger;
a=0;// 
a=0;//     #v8=(Reference,Landroid/os/Messenger;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-interface/range {v0 .. v8}, Lmm/purchasesdk/core/IPurchase;->service_order(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/core/protocol/MessengerInfo;Landroid/os/Messenger;Landroid/os/Messenger;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     sget-object v0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "\u52a8\u6001\u52a0\u8f7d\u6210\u529f"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lmm/purchasesdk/iapservice/BillingLayoutActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->a()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lmm/purchasesdk/iapservice/BillingLayoutActivity;)Landroid/os/Messenger;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mMessengerToService:Landroid/os/Messenger;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Messenger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lmm/purchasesdk/iapservice/BillingLayoutActivity;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mMessengerToService:Landroid/os/Messenger;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ServiceConnection;);
a=0;//     invoke-virtual {p0, v0}, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->unbindService(Landroid/content/ServiceConnection;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v0, "BillingLayoutActivity"
a=0;// 
a=0;//     const-string v1, "activity has unbinded!!!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     iput-object v1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mBound:Ljava/lang/Boolean;
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bind(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mConnection:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     invoke-interface {v0, p2}, Lmm/purchasesdk/core/IPurchase;->onActivityResultSendMessage(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {p0}, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Window;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-static {}, Lmm/purchasesdk/core/utils/LogUtil;->readDebugConfig()V
a=0;// 
a=0;//     const/high16 v2, -0x78000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     sput-object p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->a:Lmm/purchasesdk/iapservice/BillingLayoutActivity;
a=0;// 
a=0;//     invoke-virtual {p0}, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
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
a=0;//     iput-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "\u52a8\u6001\u52a0\u8f7d\u5931\u8d25\u8fd4\u56denull"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->mPurchaseCore:Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lmm/purchasesdk/core/IPurchase;->showProgressDialog(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-virtual {p0, p0}, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->bind(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v0, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "\u52a8\u6001\u52a0\u8f7d\u6210\u529f"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     invoke-direct {p0}, Lmm/purchasesdk/iapservice/BillingLayoutActivity;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStart()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStart()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
