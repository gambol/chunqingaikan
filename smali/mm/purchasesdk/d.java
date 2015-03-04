package mm.purchasesdk; class d { void a() { int a;
a=0;// .class public Lmm/purchasesdk/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lsafiap/framework/sdk/SAFFramework$SAFFrameworkListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lmm/purchasesdk/a;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;// .field private mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;// .field private mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Lmm/purchasesdk/Purchase;Lmm/purchasesdk/OnPurchaseListener;Lsafiap/framework/sdk/SAFFramework;Lmm/purchasesdk/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/d;);
a=0;//     iput-object p1, p0, Lmm/purchasesdk/d;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lmm/purchasesdk/d;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     iput-object p4, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     iput-object p5, p0, Lmm/purchasesdk/d;->a:Lmm/purchasesdk/a;
a=0;// 
a=0;//     iput-object p2, p0, Lmm/purchasesdk/d;->mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/16 v1, 0xdf
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
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
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lmm/purchasesdk/OnPurchaseListener;->onInitFinish(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lmm/purchasesdk/OnPurchaseListener;->onInitFinish(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     const/16 v1, 0x1b3
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Lmm/purchasesdk/OnPurchaseListener;->onBillingFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     const/16 v1, 0x202
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Lmm/purchasesdk/OnPurchaseListener;->onQueryFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     const/16 v1, 0x1d6
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Lmm/purchasesdk/OnPurchaseListener;->onQueryFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onExit()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInit(I)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->getIAPDedicateActionName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "SAFListener"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "SAFListener override method return packageName:"
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
a=0;//     const-string v3, " and set to mPackageName"
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
a=0;//     iget-object v1, p0, Lmm/purchasesdk/d;->mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/Purchase;->setPackageName(Ljava/lang/String;)V
a=0;// 
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     sput-boolean v8, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/sdk/SAFFramework;->startCheckUpdate(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lmm/purchasesdk/d;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/d;->mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/Purchase;->getCurAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     sget-object v4, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/sdk/SAFFramework;->getPluginInfo(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const-string v4, "SAFListener"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "checkresult="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
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
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const-string v2, "SAFListener"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "package name="
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v2, v0}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/Purchase;->bind(Landroid/content/Context;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     const/16 v0, -0x12c
a=0;// 
a=0;//     #v0=(Short);
a=0;//     if-ne v3, v0, :cond_2
a=0;// 
a=0;//     sput-boolean v7, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lmm/purchasesdk/d;->a(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Short);
a=0;//     const/16 v0, -0x1f4
a=0;// 
a=0;//     if-ne v3, v0, :cond_3
a=0;// 
a=0;//     sput-boolean v8, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lmm/purchasesdk/d;->a(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Short);
a=0;//     const/16 v0, -0xc8
a=0;// 
a=0;//     if-ne v3, v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Short);
a=0;//     const/16 v0, -0x190
a=0;// 
a=0;//     if-ne v3, v0, :cond_5
a=0;// 
a=0;//     sput-boolean v7, Lmm/purchasesdk/d;->a:Z
a=0;// 
a=0;//     invoke-direct {p0, v2}, Lmm/purchasesdk/d;->a(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/SAFFramework;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Short);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mPurchase:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/Purchase;->bind(Landroid/content/Context;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/d;->mFramework:Lsafiap/framework/sdk/SAFFramework;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/sdk/SAFFramework;->cleanup()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
