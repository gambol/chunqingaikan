package com.twocloo.com.cn.activitys; class OfferWallActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/OfferWallActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "OfferWallActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// .implements Lcn/waps/UpdatePointsNotifier;
a=0;// .implements Lcom/twocloooo/GetTotalMoneyListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final OFFERWALL_TYPE_DIANLE:I = 0x41
a=0;// 
a=0;// .field private static final OFFERWALL_TYPE_DUOMENG:I = 0x40
a=0;// 
a=0;// .field private static final OFFERWALL_TYPE_WANPU:I = 0x42
a=0;// 
a=0;// .field private static final TITLE:Ljava/lang/String; = "\u514d\u8d39\u83b7\u53d6\u70b9\u5238"
a=0;// 
a=0;// .field private static final UNKNOW:Ljava/lang/String; = "\u672a\u77e5\u9519\u8bef"
a=0;// 
a=0;// .field private static final VIDEO_AD_TYPE_YOUMI:I = 0x43
a=0;// 
a=0;// .field private static final YOUMI_AD_AWARD_COUNT:I = 0x5
a=0;// 
a=0;// .field private static final YOUMI_AWARD_TEXT:Ljava/lang/String; = "\u60a8\u83b7\u5f97\u4e86%s\u70b9\u5238"
a=0;// 
a=0;// .field private static final YOUMI_ONEDAY_COUNT_FINISH:Ljava/lang/String; = "\u8be5\u8bbe\u5907\u4e00\u5929\u7684\u64ad\u653e\u6b21\u6570\u5df2\u7528\u5b8c"
a=0;// 
a=0;// .field private static final YOUMI_VIDEO_AD_NO_AWARD:Ljava/lang/String; = "\u89c6\u9891\u672a\u64ad\u653e\u5b8c\u6210\uff0c\u65e0\u6cd5\u83b7\u53d6\u5956\u52b1"
a=0;// 
a=0;// .field private static final YOUMI_VIDEO_AD_WARNNING:Ljava/lang/String; = "\u9000\u51fa\u89c6\u9891\u64ad\u653e\u5c06\u65e0\u6cd5\u83b7\u5f97\u5956\u52b1"
a=0;// 
a=0;// .field private static final YOUMI_VIDEO_NOAD:Ljava/lang/String; = "\u6682\u65f6\u65e0\u5e7f\u544a\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private dianleButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private duomengButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private line3:Landroid/view/View;
a=0;// 
a=0;// .field private line4:Landroid/view/View;
a=0;// 
a=0;// .field mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private final mPageName:Ljava/lang/String;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field offerThread:Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private videoButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private wanpuButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private youmiButton:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity;);
a=0;//     const-string v0, "OfferWallActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->mPageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 71
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->offerThread:Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/OfferWallActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/OfferWallActivity;III)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->exchangePoint(III)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private exchangePoint(III)V
a=0;//     .locals 6
a=0;//     .param p1, "totalPoints"    # I
a=0;//     .param p2, "prePoints"    # I
a=0;//     .param p3, "offerwalltype"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     sub-int v2, p1, p2
a=0;// 
a=0;//     .line 250
a=0;//     .local v2, "myPoints":I
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;-><init>(Landroid/content/Context;IIILandroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->offerThread:Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->offerThread:Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/OfferwallExchangeDQThread;->start()V
a=0;// 
a=0;//     .line 254
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getYoumiPoint()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getYoumiPoints(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 230
a=0;//     .local v2, "prePonits":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/os/slidingbuxc;->getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/os/slidingbuxc;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/os/slidingbuxc;);
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/os/slidingbuxc;->slifzsd()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 231
a=0;//     .local v1, "myPointBalance":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, v1, v2
a=0;// 
a=0;//     .line 233
a=0;//     .local v0, "curPoint":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     new-instance v3, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/threads/ExchangeYDBThread;);
a=0;//     invoke-direct {v3, p0, v0, v1}, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;-><init>(Landroid/content/Context;II)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/ExchangeYDBThread;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/threads/ExchangeYDBThread;->start()V
a=0;// 
a=0;//     .line 236
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 4
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "ResourceAsColor"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 151
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->top_bar:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 152
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 153
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->button_youmi:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->youmiButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 154
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->button_dianle:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->dianleButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 155
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->button_wanpu:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->wanpuButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 156
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->button_youmi_video:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->videoButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 157
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->button_duomeng:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->duomengButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 159
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 160
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 161
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->line3:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     .line 162
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->line4:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 164
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 165
a=0;//     .local v1, "title_tv":Landroid/widget/TextView;
a=0;//     const-string v2, "\u514d\u8d39\u83b7\u53d6\u70b9\u5238"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 166
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->youmiButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->wanpuButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->dianleButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->videoButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->duomengButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 174
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 175
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private youmiVideoAD()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/OfferWallActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/OfferWallActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/OfferWallActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/video/slidingccxc;->slicdsd(Lnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getTotalMoneyFailed(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getTotalMoneySuccessed(Ljava/lang/String;J)V
a=0;//     .locals 3
a=0;//     .param p1, "arg0"    # Ljava/lang/String;
a=0;//     .param p2, "arg1"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     long-to-int v0, p2
a=0;// 
a=0;//     .line 338
a=0;//     .local v0, "dlPoint":I
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getDianlePoints(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 340
a=0;//     .local v1, "prePoints":I
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x41
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->exchangePoint(III)V
a=0;// 
a=0;//     .line 341
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getUpdatePoints(Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;//     .param p1, "arg0"    # Ljava/lang/String;
a=0;//     .param p2, "arg1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     move v1, p2
a=0;// 
a=0;//     .line 317
a=0;//     .local v1, "wpPoint":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getWanpuPoints(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 319
a=0;//     .local v0, "prePoints":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x42
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0, v1, v0, v2}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->exchangePoint(III)V
a=0;// 
a=0;//     .line 320
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getUpdatePointsFailed(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "arg0"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 179
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->finish()V
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 180
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->youmiButton:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 181
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/os/slidingboxc;->getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/os/slidingboxc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/os/slidingboxc;->sligqsd()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->dianleButton:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v0, :cond_3
a=0;// 
a=0;//     .line 183
a=0;//     invoke-static {p0}, Lcom/twocloooo/DevInit;->showOffers(Landroid/content/Context;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 184
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->wanpuButton:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v0, :cond_4
a=0;// 
a=0;//     .line 185
a=0;//     invoke-static {p0}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcn/waps/AppConnect;->showOffers(Landroid/content/Context;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->videoButton:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v0, :cond_5
a=0;// 
a=0;//     .line 188
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u9000\u51fa\u89c6\u9891\u64ad\u653e\u5c06\u65e0\u6cd5\u83b7\u5f97\u5956\u52b1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/video/slidingccxc;->slictsd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/OfferWallActivity$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/OfferWallActivity$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/OfferWallActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$3;);
a=0;//     invoke-virtual {v0, p0, v1}, Lnet/slidingmenu/tools/video/slidingccxc;->slidisd(Landroid/content/Context;Lnet/slidingmenu/tools/video/slidingcbxc;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 221
a=0;//     :cond_5
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->duomengButton:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 222
a=0;//     invoke-static {p0}, Lcn/dm/android/DMOfferWall;->getInstance(Landroid/content/Context;)Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcn/dm/android/DMOfferWall;->showOfferWall(Landroid/content/Context;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 108
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 109
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->offerwall_layout:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 111
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->setTopBar()V
a=0;// 
a=0;//     .line 113
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->youmiVideoAD()V
a=0;// 
a=0;//     .line 114
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 309
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/slidingccxc;->slibnsd()V
a=0;// 
a=0;//     .line 310
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 311
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 299
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 301
a=0;//     const-string v0, "OfferWallActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 302
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 303
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 257
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 258
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 267
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity;->getYoumiPoint()V
a=0;// 
a=0;//     .line 269
a=0;//     invoke-static {p0}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcn/waps/AppConnect;->getPoints(Lcn/waps/UpdatePointsNotifier;)V
a=0;// 
a=0;//     .line 271
a=0;//     sget-object v0, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 272
a=0;//     invoke-static {p0, p0}, Lcom/twocloooo/DevInit;->getTotalMoney(Landroid/content/Context;Lcom/twocloooo/GetTotalMoneyListener;)V
a=0;// 
a=0;//     .line 275
a=0;//     :cond_0
a=0;//     invoke-static {p0}, Lcn/dm/android/DMOfferWall;->getInstance(Landroid/content/Context;)Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferWall;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/OfferWallActivity$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/OfferWallActivity$4;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/OfferWallActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/OfferWallActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/OfferWallActivity$4;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/DMOfferWall;->checkPoints(Lcn/dm/android/listener/CheckPointListener;)V
a=0;// 
a=0;//     .line 291
a=0;//     const-string v0, "OfferWallActivity"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 292
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 294
a=0;//     return-void
a=0;// .end method
}}
