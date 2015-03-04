package mm.purchasesdk.sdk; class g { void a() { int a;
a=0;// .class public Lmm/purchasesdk/sdk/g;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static TAG:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private a:Landroid/os/Bundle;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;// .field private mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;// .field private mReturnData:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "IABClientHandler"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lmm/purchasesdk/sdk/g;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lmm/purchasesdk/OnPurchaseListener;Landroid/os/Handler;Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/sdk/g;);
a=0;//     iput-object p2, p0, Lmm/purchasesdk/sdk/g;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     iput-object p3, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/HashMap;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
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
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getPurchseCore()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-interface {v0, v1}, Lmm/purchasesdk/core/IPurchase;->readImsi(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getPurchseCore()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v3, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v3=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v3}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getCopyrightCert()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v4=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v5=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-interface/range {v0 .. v5}, Lmm/purchasesdk/core/IPurchase;->checkAuth(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Lmm/purchasesdk/PurchaseCode;->setStatusCode(I)V
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
a=0;// .method private dyQuest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/g;->TAG:Ljava/lang/String;
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
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getPurchseCore()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-interface {v0, v1}, Lmm/purchasesdk/core/IPurchase;->SetIsNeedDyquestion(Z)V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getPurchseCore()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Lmm/purchasesdk/core/IPurchase;->getDyQuestion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getPurchseCore()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
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
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 9
a=0;// 
a=0;//     const/16 v8, 0x66
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/16 v6, 0x32a
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     const-string v0, "Client "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "handleMessage Client "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, p1, Landroid/os/Message;->what:I
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
a=0;//     invoke-static {v0, v3}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const-string v0, "Client "
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "handleMessage Client sessionId:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getSessionID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0, v4}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq v0, v4, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getIDToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v4, "\u670d\u52a1\u4e0d\u5408\u6cd5\uff0c\u8bf7\u6b63\u786e\u8bbe\u7f6e\u4f18\u5148\u7ea7\uff0c\u6216\u5347\u7ea7\u5230\u6700\u65b0\u7684\u8ba1\u8d39\u670d\u52a1"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v4, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getIDToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v4=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTimeStamp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getResult()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v4, v5}, Lmm/purchasesdk/fingerprint/IdentifyApp;->IdTokenService([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getIdtoken_verf()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getIdtoken_verf()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     iget v4, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(One);v2=(Null);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v4, "\u670d\u52a1\u4e0d\u5408\u6cd5"
a=0;// 
a=0;//     invoke-static {v0, v4, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v4=(PosByte);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Boolean);v4=(Integer);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v2, "Paycode"
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v4=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     const-string v4, "OrderId"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getLeftDay()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_5
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
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     const-string v4, "LeftDay"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_5
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTradeID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_6
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
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     const-string v4, "TradeID"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_7
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
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     const-string v4, "OrderType"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lmm/purchasesdk/PurchaseCode;->setMessage(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPurchasecode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     const/16 v0, 0x65
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq v2, v0, :cond_b
a=0;// 
a=0;//     if-eq v2, v8, :cond_8
a=0;// 
a=0;//     if-ne v2, v8, :cond_a
a=0;// 
a=0;//     :cond_8
a=0;//     invoke-direct {p0, v1}, Lmm/purchasesdk/sdk/g;->a(Ljava/util/HashMap;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v2=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPurchasecode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v2, v1}, Lmm/purchasesdk/OnPurchaseListener;->onBillingFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     :goto_2
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-interface {v0, v6, v7}, Lmm/purchasesdk/OnPurchaseListener;->onBillingFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(PosByte);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v2=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPurchasecode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v2, v1}, Lmm/purchasesdk/OnPurchaseListener;->onBillingFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(PosByte);
a=0;//     const/16 v0, 0x65
a=0;// 
a=0;//     if-ne v2, v0, :cond_c
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-interface {v0, v8, v1}, Lmm/purchasesdk/OnPurchaseListener;->onBillingFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(PosByte);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-interface {v0, v6, v7}, Lmm/purchasesdk/OnPurchaseListener;->onBillingFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Boolean);v1=(One);v2=(Null);v4=(Integer);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     if-nez v1, :cond_d
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_d
a=0;//     if-nez v0, :cond_e
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-interface {v0, v6, v7}, Lmm/purchasesdk/OnPurchaseListener;->onBillingFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getDyQuestion()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_f
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAppID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v2=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getSessionID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1, v2}, Lmm/purchasesdk/sdk/g;->dyQuest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getPurchseCore()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Lmm/purchasesdk/core/IPurchase;->StartDyQuestThread(Lmm/purchasesdk/core/protocol/MessengerInfo;Landroid/os/Handler;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_f
a=0;//     #v1=(Conflicted);v2=(Null);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Boolean);v1=(One);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     if-nez v1, :cond_10
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_10
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v1, v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     invoke-static {v7}, Lmm/purchasesdk/PurchaseCode;->setMessage(Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPurchasecode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lmm/purchasesdk/OnPurchaseListener;->onInitFinish(I)V
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);
a=0;//     iput v2, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_11
a=0;//     #v0=(Boolean);v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-interface {v0, v6}, Lmm/purchasesdk/OnPurchaseListener;->onInitFinish(I)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Boolean);v1=(One);v4=(Integer);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v2=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     if-nez v2, :cond_12
a=0;// 
a=0;//     new-instance v2, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v2=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_12
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v2, v4}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mReturnData:Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v2, :cond_13
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v2, p0, Lmm/purchasesdk/sdk/g;->mReturnData:Ljava/util/HashMap;
a=0;// 
a=0;//     :cond_13
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lmm/purchasesdk/PurchaseCode;->setMessage(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mReturnData:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v4, "LeftDay"
a=0;// 
a=0;//     iget-object v5, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getLeftDay()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mReturnData:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v4, "OrderId"
a=0;// 
a=0;//     iget-object v5, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mReturnData:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v4, "Paycode"
a=0;// 
a=0;//     iget-object v5, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPurchasecode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v4, p0, Lmm/purchasesdk/sdk/g;->mReturnData:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-interface {v0, v2, v4}, Lmm/purchasesdk/OnPurchaseListener;->onQueryFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);
a=0;//     iput v1, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_14
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-interface {v0, v6, v7}, Lmm/purchasesdk/OnPurchaseListener;->onQueryFinish(ILjava/util/HashMap;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Boolean);v2=(Null);v4=(Integer);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     if-nez v1, :cond_15
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_15
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v1, v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lmm/purchasesdk/PurchaseCode;->setMessage(Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPurchasecode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, v1}, Lmm/purchasesdk/OnPurchaseListener;->onUnsubscribeFinish(I)V
a=0;// 
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_16
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mListener:Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/OnPurchaseListener;);
a=0;//     invoke-interface {v0, v6}, Lmm/purchasesdk/OnPurchaseListener;->onUnsubscribeFinish(I)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Boolean);v1=(One);v2=(Null);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     if-nez v0, :cond_17
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     :cond_17
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/sdk/g;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/PurchaseCode;->setMessage(Ljava/lang/String;)V
a=0;// 
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v3, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/sdk/g;->mInfo:Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_3
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
}}
