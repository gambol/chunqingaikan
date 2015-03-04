package com.twocloo.com.cn.activitys; class SettingActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/SettingActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SettingActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;// .field private cleancachelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private cleansdlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private containerlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private keeplightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private line:Landroid/view/View;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;// .field private nightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private pushSet:Landroid/widget/CheckBox;
a=0;// 
a=0;// .field private pushlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private setKeepScreenOn:Landroid/widget/CheckBox;
a=0;// 
a=0;// .field private title:Landroid/widget/TextView;
a=0;// 
a=0;// .field private topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private updateLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private updatelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private xuxian1:Landroid/view/View;
a=0;// 
a=0;// .field private xuxian2:Landroid/view/View;
a=0;// 
a=0;// .field private xuxian3:Landroid/view/View;
a=0;// 
a=0;// .field private xuxian4:Landroid/view/View;
a=0;// 
a=0;// .field private xuxian5:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity;);
a=0;//     const-string v0, "SettingActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/SettingActivity;)Landroid/widget/CheckBox;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/SettingActivity;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private setDayOrNightMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->containerlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->updateLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->keeplightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->cleansdlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->cleancachelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->line:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setxuxianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setxuxianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian3:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setxuxianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian4:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setxuxianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian5:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setxuxianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 230
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "\u8bbe\u7f6e"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$color;->usercenter_text:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 154
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageButton;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 157
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cleanCache(Landroid/view/View;)V
a=0;//     .locals 8
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u5c06\u6e05\u7a7a\u6240\u6709\u7528\u6237\u76f8\u5173\u6570\u636e"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u53d6\u6d88"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/activitys/SettingActivity$6;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/activitys/SettingActivity$6;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/activitys/SettingActivity$6;-><init>(Lcom/twocloo/com/cn/activitys/SettingActivity;)V
a=0;// 
a=0;//     .line 280
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity$6;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/activitys/SettingActivity$7;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/activitys/SettingActivity$7;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/activitys/SettingActivity$7;-><init>(Lcom/twocloo/com/cn/activitys/SettingActivity;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity$7;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 272
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 287
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public cleanData(Landroid/view/View;)V
a=0;//     .locals 8
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u6e05\u7406\u5f53\u524d\u5e94\u7528SD\u5361\u6570\u636e"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "\u786e\u5b9a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u53d6\u6d88"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/activitys/SettingActivity$4;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/activitys/SettingActivity$4;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/activitys/SettingActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/SettingActivity;)V
a=0;// 
a=0;//     .line 258
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity$4;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/activitys/SettingActivity$5;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/activitys/SettingActivity$5;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/activitys/SettingActivity$5;-><init>(Lcom/twocloo/com/cn/activitys/SettingActivity;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity$5;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 250
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 266
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public keepScreenOn(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 298
a=0;//     .local v0, "cBox":Landroid/widget/CheckBox;
a=0;//     invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 299
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setKeepScreenOn(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 303
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setKeepScreenOn(Landroid/content/Context;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public nightModeOn(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 312
a=0;//     .local v0, "cBox":Landroid/widget/CheckBox;
a=0;//     invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 313
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrnt(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 317
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 315
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrnt(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 160
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->backBtn:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 161
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->finish()V
a=0;// 
a=0;//     .line 191
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 162
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     .line 163
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getIsSetPush(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushSet:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 165
a=0;//     invoke-static {p0, v4}, Lcom/twocloo/com/cn/common/LocalStore;->setPush(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 166
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 167
a=0;//     .local v0, "intentService":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->stopService(Landroid/content/Intent;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     .end local v0    # "intentService":Landroid/content/Intent;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushSet:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setPush(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 171
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/http/UpdateService;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 172
a=0;//     .restart local v0    # "intentService":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 174
a=0;//     .end local v0    # "intentService":Landroid/content/Intent;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->keeplightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_5
a=0;// 
a=0;//     .line 175
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getKeepScreenOn(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->setKeepScreenOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 177
a=0;//     invoke-static {p0, v4}, Lcom/twocloo/com/cn/common/LocalStore;->setKeepScreenOn(Landroid/content/Context;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->setKeepScreenOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 180
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setKeepScreenOn(Landroid/content/Context;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_5
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ne v1, v3, :cond_6
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 185
a=0;//     invoke-static {p0, v4}, Lcom/twocloo/com/cn/common/LocalStore;->setMrnt(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_6
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 188
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setMrnt(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 44
a=0;//     #v2=(One);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 45
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SettingActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 46
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->novel_set:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 48
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->topbarlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 49
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->mainlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 50
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->container:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->containerlayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 51
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->update_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->updateLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 52
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->pushlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 53
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->keeplightlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->keeplightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 54
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nightlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 55
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->clear_sd_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->cleansdlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 56
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->clear_cache_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->cleancachelayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 57
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line6:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->line:Landroid/view/View;
a=0;// 
a=0;//     .line 58
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian1:Landroid/view/View;
a=0;// 
a=0;//     .line 59
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian2:Landroid/view/View;
a=0;// 
a=0;//     .line 60
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian3:Landroid/view/View;
a=0;// 
a=0;//     .line 61
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line4:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian4:Landroid/view/View;
a=0;// 
a=0;//     .line 62
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line5:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->xuxian5:Landroid/view/View;
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->keeplightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 68
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->set_push:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/CheckBox;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushSet:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 69
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->set_keepScreenOn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/CheckBox;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->setKeepScreenOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 70
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->night_checkbox:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/CheckBox;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 72
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getIsSetPush(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushSet:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getKeepScreenOn(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->setKeepScreenOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 84
a=0;//     :goto_1
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 107
a=0;//     :goto_2
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SettingActivity;->setTopBar()V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->updateLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/SettingActivity$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/SettingActivity$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/SettingActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/SettingActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushSet:Landroid/widget/CheckBox;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/SettingActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/SettingActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/SettingActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/SettingActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/SettingActivity$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/SettingActivity$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/SettingActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/SettingActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/SettingActivity$3;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->pushSet:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->setKeepScreenOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 243
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 244
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 235
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SettingActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 236
a=0;//     const-string v0, "SettingActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 237
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 238
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 194
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 195
a=0;//     const-string v0, "SettingActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 196
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 197
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 199
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     .line 200
a=0;//     invoke-static {p0, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setMrnt(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 203
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/Util;->setBrightness(Landroid/app/Activity;I)V
a=0;// 
a=0;//     .line 204
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrld(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 212
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     return-void
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrnt(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SettingActivity;->nightModeOn:Landroid/widget/CheckBox;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/CheckBox;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V
a=0;// 
a=0;//     .line 209
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/Util;->setBrightness(Landroid/app/Activity;I)V
a=0;// 
a=0;//     .line 210
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setMrld(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
