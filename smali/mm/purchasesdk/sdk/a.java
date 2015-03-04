package mm.purchasesdk.sdk; class a { void a() { int a;
a=0;// .class public Lmm/purchasesdk/sdk/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private static a:Ljava/lang/String;
a=0;// 
a=0;// .field private static b:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-class v0, Lmm/purchasesdk/sdk/a;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     sput-object v1, Lmm/purchasesdk/sdk/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     sput-object v1, Lmm/purchasesdk/sdk/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/sdk/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)I
a=0;//     .locals 6
a=0;// 
a=0;//     const/16 v0, 0x4b0
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v1, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "checkAPK 1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v3, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const-string v1, "utf-8"
a=0;// 
a=0;//     invoke-interface {v2, v3, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-eq v1, v3, :cond_4
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v3=(One);
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "ProgramId"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v3, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "aProgramId = "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v3, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     sget-object v2, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "failed to read mmiap.xml excepiton. "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v3=(Boolean);
a=0;//     const-string v3, "Provider"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v3, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "aProvider = "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v3, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     sget-object v2, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "failed to read mmiap.xml. io excetion "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v3=(Boolean);
a=0;//     const-string v3, "Mark"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lmm/purchasesdk/sdk/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "aMark = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lmm/purchasesdk/sdk/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     const-string v3, "channel"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sput-object v1, Lmm/purchasesdk/sdk/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "achannel = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget-object v4, Lmm/purchasesdk/sdk/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/sdk/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setChannelID(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);v3=(One);v4=(Conflicted);
a=0;//     const/16 v0, 0x4b2
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lmm/purchasesdk/core/protocol/MessengerInfo;)Ljava/lang/Boolean;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/16 v5, 0x4b9
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "checkAuth"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/16 v0, 0x3e9
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v0}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getProgramID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "100000000000"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->isPaycodeStyle()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v6, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lmm/purchasesdk/sdk/a;->a(Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/billing/ProductInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/billing/ProductInfo;);
a=0;//     invoke-virtual {p1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setProductInfo(Lmm/purchasesdk/core/billing/ProductInfo;)V
a=0;// 
a=0;//     const-string v0, "000000000000"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setChannelID(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "000000000000"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setChannelID(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {v5}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getPurchseCore()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     invoke-interface {v0, p0}, Lmm/purchasesdk/core/IPurchase;->getChannelID(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getProgramID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "100000000000"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     invoke-static {v1, p1}, Lmm/purchasesdk/sdk/a;->a(Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x4b2
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-eq v3, v2, :cond_2
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "MD5 error: "
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {v2}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v3=(Conflicted);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "read mmiap.xml false "
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {v5}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getProgramID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "100000000000"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     invoke-static {v1}, Lmm/purchasesdk/sdk/a;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-static {v5}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     const-string v2, "datas"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, p1}, Lmm/purchasesdk/sdk/a;->c(Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/billing/ProductInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_1
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     invoke-static {v5}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v5}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1, p1}, Lmm/purchasesdk/sdk/a;->a(Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/billing/ProductInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/fingerprint/IdentifyApp;->md5([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v2, Lmm/purchasesdk/sdk/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "md5data error: "
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/16 v0, 0x4b4
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-static {v0}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setProductInfo(Lmm/purchasesdk/core/billing/ProductInfo;)V
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lmm/purchasesdk/core/protocol/MessengerInfo;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lmm/purchasesdk/fingerprint/IdentifyApp;->getPurchseCore()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     invoke-interface {v1, p0}, Lmm/purchasesdk/core/IPurchase;->getChannelID(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/xmlpull/v1/XmlPullParserFactory;);
a=0;//     invoke-virtual {v2}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v3, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const-string v1, "utf-8"
a=0;// 
a=0;//     invoke-interface {v2, v3, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-eq v1, v3, :cond_1
a=0;// 
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v3=(One);
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "channel"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sput-object v1, Lmm/purchasesdk/sdk/a;->a:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     sget-object v2, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "failed to read mmiap.xml excepiton. "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/sdk/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     sget-object v2, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "failed to read mmiap.xml. io excetion "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v1}, Lmm/purchasesdk/core/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     sput-object v0, Lmm/purchasesdk/sdk/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v3=(One);
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "LOCAL ChannelID:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Lmm/purchasesdk/sdk/a;->a:Ljava/lang/String;
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
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     const-string v0, "datas"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "<datas>"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x7
a=0;// 
a=0;//     :goto_0
a=0;//     const-string v1, "datas"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const-string v1, "<Mark>"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     if-gez v1, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "<ProgramId>"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     const-string v1, "<Mark>"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "md5data signContent is: "
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
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "md5data signContentlength  is: "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
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
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, " "
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/billing/ProductInfo;
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, p2}, Lmm/purchasesdk/sdk/a;->b(Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/billing/ProductInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/billing/ProductInfo;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljavax/xml/parsers/ParserConfigurationException;);
a=0;//     invoke-virtual {v1}, Ljavax/xml/parsers/ParserConfigurationException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/xml/sax/SAXException;);
a=0;//     invoke-virtual {v1}, Lorg/xml/sax/SAXException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/billing/ProductInfo;
a=0;//     .locals 8
a=0;// 
a=0;//     const v7, -0x9a00
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/high16 v4, -0x1000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     new-instance v0, Lmm/purchasesdk/core/billing/ProductInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/billing/ProductInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/billing/ProductInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/billing/ProductInfo;);
a=0;//     new-instance v1, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v2, "appname"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "\u5e94\u7528\u540d\u79f0\uff1a"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAppID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     iput v4, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v2, "provider"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "\u63d0\u4f9b\u5546\uff1a"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getAppID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     iput v4, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v2, "itemname"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "\u5546\u54c1\uff1a"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     iput v4, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v2, "itemprice"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "\u5355\u4ef7\uff1a"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "0.1\u5143"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     iput v7, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v2, "itemcount"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "\u6570\u91cf\uff1a"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderCount()I
a=0;// 
a=0;//     move-result v3
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
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     iput v7, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v2, "totalprice"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "\u652f\u4ed8\u91d1\u989d:"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const-wide v5, 0x3fb999999999999aL    # 0.1
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     mul-double/2addr v3, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u5143"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     iput v7, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lorg/w3c/dom/Element;Ljava/lang/String;I)Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-interface {p0, p1}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/w3c/dom/NodeList;);
a=0;//     invoke-interface {v0, p2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lorg/w3c/dom/Element;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v0}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/w3c/dom/Node;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {v0}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v2, "Provider"
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v2, "provider"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "\u63d0\u4f9b\u5546:"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     const-string v2, "AppName"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v2, "appname"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "\u5e94\u7528\u540d\u79f0:"
a=0;// 
a=0;//     iput-object v2, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lmm/purchasesdk/core/billing/ProductInfo;FLmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const v3, -0x9a00
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-instance v0, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v1, "itemcount"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "\u6570\u91cf\uff1a"
a=0;// 
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
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
a=0;//     invoke-virtual {p2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderCount()I
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
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     iput v3, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     iget-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v1, "totalprice"
a=0;// 
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "\u652f\u4ed8\u91d1\u989d:"
a=0;// 
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v2, p1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\u5143"
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
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     iput v3, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     iget-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static b(Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/billing/ProductInfo;
a=0;//     .locals 13
a=0;// 
a=0;//     const/16 v12, 0x4ba
a=0;// 
a=0;//     #v12=(PosShort);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/high16 v11, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "enter parseProductInfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v5, Lmm/purchasesdk/core/billing/ProductInfo;
a=0;// 
a=0;//     #v5=(UninitRef,Lmm/purchasesdk/core/billing/ProductInfo;);
a=0;//     invoke-direct {v5}, Lmm/purchasesdk/core/billing/ProductInfo;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Lmm/purchasesdk/core/billing/ProductInfo;);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lorg/w3c/dom/Element;);
a=0;//     const-string v0, "AppName"
a=0;// 
a=0;//     invoke-interface {v6, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "ProductInfo"
a=0;// 
a=0;//     invoke-interface {v6, v1}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/w3c/dom/NodeList;->getLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v4, :cond_0
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/w3c/dom/NodeList;->getLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {v12}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Reference,Lmm/purchasesdk/core/billing/ProductInfo;);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Lorg/w3c/dom/NodeList;);v2=(Null);v3=(Null);v4=(One);v6=(Reference,Lorg/w3c/dom/Element;);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     const-string v0, "appname"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "AppName"
a=0;// 
a=0;//     invoke-static {v6, v1, v2}, Lmm/purchasesdk/sdk/a;->a(Lorg/w3c/dom/Element;Ljava/lang/String;I)Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     const-string v0, "appname"
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "provider"
a=0;// 
a=0;//     const-string v1, "Provider"
a=0;// 
a=0;//     invoke-static {v6, v1, v2}, Lmm/purchasesdk/sdk/a;->a(Lorg/w3c/dom/Element;Ljava/lang/String;I)Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     const-string v0, "provider"
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "ProductInfo"
a=0;// 
a=0;//     invoke-interface {v6, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/w3c/dom/NodeList;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v7}, Lorg/w3c/dom/NodeList;->getLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_6
a=0;// 
a=0;//     const-string v0, "paycode"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v6, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lorg/w3c/dom/Element;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/w3c/dom/Node;);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-static {v0}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v8, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "paycode ="
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v8, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "apaycode ="
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const-string v0, "ProductInfo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v6, v0}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lorg/w3c/dom/Element;
a=0;// 
a=0;//     const-string v1, "Item"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/w3c/dom/NodeList;);
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "nodes.getLength() = "
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/w3c/dom/NodeList;->getLength()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Float);v2=(Integer);v4=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     invoke-interface {v3}, Lorg/w3c/dom/NodeList;->getLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v3, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/w3c/dom/Node;);
a=0;//     check-cast v0, Lorg/w3c/dom/Element;
a=0;// 
a=0;//     check-cast v0, Lorg/w3c/dom/Element;
a=0;// 
a=0;//     const-string v4, "id"
a=0;// 
a=0;//     invoke-interface {v0, v4}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, "name"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v6}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "value"
a=0;// 
a=0;//     invoke-interface {v0, v7}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v7, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "id = "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v7, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "name = "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v7, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "value = "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v7, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v7=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v7}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-static {v4}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v6}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, ":"
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "info.mID = "
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v6, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0, v4}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "info.mKey = "
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v6, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0, v4}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "info.mValue = "
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v6, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0, v4}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "itemprice"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-object v0, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "\u5206"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Integer;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->floatValue()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v4, v11
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "\u5143"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float/2addr v0, v11
a=0;// 
a=0;//     sget-object v1, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Price = "
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v6, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v1, v4}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "totalprice"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget-object v1, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "itemcount"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget-object v1, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "itemprice"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     iget-object v1, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "renttime"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     const v1, -0x9a00
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     :goto_5
a=0;//     iget-object v1, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v1}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v1, v7}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     const/high16 v1, -0x1000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v7, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Float);v6=(Conflicted);
a=0;//     invoke-static {v5, v1, p2}, Lmm/purchasesdk/sdk/a;->a(Lmm/purchasesdk/core/billing/ProductInfo;FLmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     move-object v3, v5
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Null);v3=(Null);v4=(Null);v6=(Reference,Lorg/w3c/dom/Element;);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-static {v12}, Lmm/purchasesdk/core/PurchaseCode;->setStatusCode(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Float);v2=(Integer);v3=(Reference,Lorg/w3c/dom/NodeList;);v4=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Reference,Lorg/w3c/dom/Element;);v1=(Integer);v2=(Null);v3=(Null);v4=(Null);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static c(Ljava/lang/String;Ljava/lang/String;Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/billing/ProductInfo;
a=0;//     .locals 12
a=0;// 
a=0;//     new-instance v6, Lmm/purchasesdk/sdk/c;
a=0;// 
a=0;//     #v6=(UninitRef,Lmm/purchasesdk/sdk/c;);
a=0;//     invoke-direct {v6}, Lmm/purchasesdk/sdk/c;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Lmm/purchasesdk/sdk/c;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/xmlpull/v1/XmlPullParserFactory;);
a=0;//     invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/xmlpull/v1/XmlPullParser;);
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,[B);
a=0;//     invoke-direct {v0, v8}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const-string v8, "utf-8"
a=0;// 
a=0;//     invoke-interface {v7, v0, v8}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v11, v0
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     move v5, v11
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Reference,Lmm/purchasesdk/sdk/f;);v2=(Reference,Ljava/util/ArrayList;);v3=(Reference,Ljava/util/ArrayList;);v4=(Reference,Lmm/purchasesdk/sdk/b;);v5=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     if-eq v5, v8, :cond_12
a=0;// 
a=0;//     packed-switch v5, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v5=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v8=(One);
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "data"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     new-instance v4, Lmm/purchasesdk/sdk/b;
a=0;// 
a=0;//     #v4=(UninitRef,Lmm/purchasesdk/sdk/b;);
a=0;//     invoke-direct {v4}, Lmm/purchasesdk/sdk/b;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lmm/purchasesdk/sdk/b;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v8, "ProgramId"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lmm/purchasesdk/sdk/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v8, "AppName"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lmm/purchasesdk/sdk/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     const-string v8, "Provider"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lmm/purchasesdk/sdk/b;->setProvider(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     const-string v8, "Files"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     const-string v8, "File"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v7, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-interface {v7, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-interface {v7, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v10, Lmm/purchasesdk/sdk/d;
a=0;// 
a=0;//     #v10=(UninitRef,Lmm/purchasesdk/sdk/d;);
a=0;//     invoke-static {v5}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v8}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v9}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v10, v5, v8, v9}, Lmm/purchasesdk/sdk/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Lmm/purchasesdk/sdk/d;);
a=0;//     invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v8=(Boolean);v9=(Conflicted);v10=(Conflicted);
a=0;//     const-string v8, "Products"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     const-string v8, "ProductInfo"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/sdk/f;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/sdk/f;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/sdk/f;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/sdk/f;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     const-string v8, "paycode"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Lmm/purchasesdk/sdk/f;->setPaycode(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     const-string v8, "Items"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_a
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     const-string v8, "Item"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_b
a=0;// 
a=0;//     new-instance v5, Lmm/purchasesdk/sdk/e;
a=0;// 
a=0;//     #v5=(UninitRef,Lmm/purchasesdk/sdk/e;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-interface {v7, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-interface {v7, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-interface {v7, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10}, Lmm/purchasesdk/fingerprint/IdentifyApp;->decryptPapaya(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v5, v8, v9, v10}, Lmm/purchasesdk/sdk/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lmm/purchasesdk/sdk/e;);
a=0;//     invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_b
a=0;//     #v8=(Boolean);v9=(Conflicted);v10=(Conflicted);
a=0;//     const-string v8, "Mark"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_d
a=0;// 
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-ne v5, v9, :cond_c
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Lmm/purchasesdk/sdk/b;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_c
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     if-ne v5, v9, :cond_0
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lmm/purchasesdk/sdk/c;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_d
a=0;//     #v5=(Reference,Ljava/lang/String;);v8=(Boolean);v9=(Conflicted);
a=0;//     const-string v8, "channel"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Lmm/purchasesdk/sdk/c;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v5=(Integer);v8=(One);
a=0;//     invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "Files"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_e
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Lmm/purchasesdk/sdk/b;->a(Ljava/util/List;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_e
a=0;//     const-string v8, "Items"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_f
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/sdk/f;->c(Ljava/util/List;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_f
a=0;//     const-string v8, "ProductInfo"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_10
a=0;// 
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_10
a=0;//     const-string v8, "Products"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_11
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Lmm/purchasesdk/sdk/b;->b(Ljava/util/List;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_11
a=0;//     const-string v8, "data"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Lmm/purchasesdk/sdk/c;->a(Lmm/purchasesdk/sdk/b;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_12
a=0;//     #v5=(Integer);v8=(One);
a=0;//     invoke-virtual {v6, p1}, Lmm/purchasesdk/sdk/c;->a(Ljava/lang/String;)Lmm/purchasesdk/sdk/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lmm/purchasesdk/sdk/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setProgramID(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v4, Lmm/purchasesdk/core/billing/ProductInfo;
a=0;// 
a=0;//     #v4=(UninitRef,Lmm/purchasesdk/core/billing/ProductInfo;);
a=0;//     invoke-direct {v4}, Lmm/purchasesdk/core/billing/ProductInfo;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lmm/purchasesdk/core/billing/ProductInfo;);
a=0;//     new-instance v0, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v1, "provider"
a=0;// 
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "\u63d0\u4f9b\u5546:"
a=0;// 
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3}, Lmm/purchasesdk/sdk/b;->getProvider()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "provider"
a=0;// 
a=0;//     invoke-virtual {v4, v1, v0}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     const-string v0, "provider"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const-string v1, "appname"
a=0;// 
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "\u5e94\u7528\u540d\u79f0:"
a=0;// 
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3}, Lmm/purchasesdk/sdk/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "appname"
a=0;// 
a=0;//     invoke-virtual {v4, v1, v0}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     const-string v0, "appname"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Lmm/purchasesdk/sdk/f;);v1=(Reference,Lmm/purchasesdk/sdk/f;);v2=(Integer);
a=0;//     if-eqz v3, :cond_13
a=0;// 
a=0;//     invoke-virtual {v3}, Lmm/purchasesdk/sdk/b;->a()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_13
a=0;// 
a=0;//     invoke-virtual {v3}, Lmm/purchasesdk/sdk/b;->a()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/sdk/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/f;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     invoke-virtual {v3}, Lmm/purchasesdk/sdk/b;->a()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/sdk/f;
a=0;// 
a=0;//     :goto_3
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/sdk/f;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_13
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Integer);v2=(Integer);v3=(Float);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/sdk/f;->b()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_17
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/sdk/f;->b()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/sdk/e;
a=0;// 
a=0;//     sget-object v5, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "id = "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/e;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v5, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "name = "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/e;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v5, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "value = "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/e;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v5, Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// 
a=0;//     #v5=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-direct {v5}, Lmm/purchasesdk/core/ui/ViewItemInfo;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/e;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/e;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ":"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iput-object v6, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/sdk/e;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "info.mID = "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v0, v6}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "info.mKey = "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v0, v6}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "info.mValue = "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v0, v6}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     const-string v6, "itemprice"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     iget-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "\u5206"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     invoke-virtual {v0, v3, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Ljava/lang/Integer;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/Integer;);
a=0;//     invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->floatValue()F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     const/high16 v7, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     div-float/2addr v6, v7
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "\u5143"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v3, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-float v3, v0, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sget-object v0, Lmm/purchasesdk/sdk/a;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Price = "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v0, v6}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "totalprice"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_15
a=0;// 
a=0;//     iget-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "itemcount"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_15
a=0;// 
a=0;//     iget-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "itemprice"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_15
a=0;// 
a=0;//     iget-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "renttime"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     :cond_15
a=0;//     const v0, -0x9a00
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     :goto_5
a=0;//     iget-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v0}, Lmm/purchasesdk/core/billing/ProductInfo;->addKey(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v0, v5}, Lmm/purchasesdk/core/billing/ProductInfo;->addValue(Ljava/lang/String;Lmm/purchasesdk/core/ui/ViewItemInfo;)V
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_16
a=0;//     #v0=(Boolean);
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v5, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_17
a=0;//     #v5=(Conflicted);
a=0;//     invoke-static {v4, v3, p2}, Lmm/purchasesdk/sdk/a;->a(Lmm/purchasesdk/core/billing/ProductInfo;FLmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     :cond_18
a=0;//     #v0=(Boolean);v3=(Reference,Lmm/purchasesdk/sdk/b;);v5=(Integer);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/sdk/f;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
