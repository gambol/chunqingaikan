package com.twocloo.com.cn.activitys; class RegistActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// .super Lcom/twocloo/base/openapi/QZoneAble;
a=0;// .source "RegistActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// .implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private check:Landroid/widget/CheckBox;
a=0;// 
a=0;// .field private confirmPsdEdit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private hasChecked:Z
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private line3:Landroid/view/View;
a=0;// 
a=0;// .field private line4:Landroid/view/View;
a=0;// 
a=0;// .field private line5:Landroid/view/View;
a=0;// 
a=0;// .field private mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private nameEdit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private nicknameedit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private passwordEdit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private phoneEdit:Landroid/widget/EditText;
a=0;// 
a=0;// .field private privacytv:Landroid/widget/TextView;
a=0;// 
a=0;// .field private progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private registerConfirmBtn:Landroid/widget/Button;
a=0;// 
a=0;// .field private titleText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private topbarlayot:Landroid/widget/LinearLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/openapi/QZoneAble;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     const-string v0, "RegistActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 54
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->hasChecked:Z
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/RegistActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/RegistActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/RegistActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/RegistActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/RegistActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initViews()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 136
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 137
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     .line 138
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line4:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     .line 139
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line5:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     .line 140
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->top_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->topbarlayot:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 141
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainlayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 142
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->name_edit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->nameEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 143
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->password_edit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->passwordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 144
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->confirmpsd_edit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->confirmPsdEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 145
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->phone_edit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->phoneEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 146
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->registerConfirmBtn:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->registerConfirmBtn:Landroid/widget/Button;
a=0;// 
a=0;//     .line 147
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->read_check:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/CheckBox;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->check:Landroid/widget/CheckBox;
a=0;// 
a=0;//     .line 148
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->privacy_tv:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->privacytv:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 149
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nickname_edit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->nicknameedit:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 150
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 151
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->titleText:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->registerConfirmBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->check:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->privacytv:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTopBar()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->titleText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v2, "\u6ce8\u518c"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 163
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 164
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->topbarlayot:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 165
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "arg0"    # Landroid/widget/CompoundButton;
a=0;//     .param p2, "isChecked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 260
a=0;//     #v2=(One);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 261
a=0;//     iput-boolean v2, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->hasChecked:Z
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->registerConfirmBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->login_button_selector:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->registerConfirmBtn:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 269
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 266
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->registerConfirmBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->gray_button:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->registerConfirmBtn:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 11
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 204
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 205
a=0;//     .local v7, "id":I
a=0;//     #v7=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v7, v1, :cond_1
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->finish()V
a=0;// 
a=0;//     .line 256
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 207
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->registerConfirmBtn:I
a=0;// 
a=0;//     if-ne v7, v1, :cond_a
a=0;// 
a=0;//     .line 208
a=0;//     iget-boolean v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->hasChecked:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->nameEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 212
a=0;//     .local v2, "name":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->passwordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 213
a=0;//     .local v3, "password":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->confirmPsdEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 214
a=0;//     .local v9, "psdConfirm":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->phoneEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 215
a=0;//     .local v4, "mobile":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->nicknameedit:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 216
a=0;//     .local v6, "nickname":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->nameEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/Util;->shakeAnimation(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 221
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->nicknameedit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/Util;->shakeAnimation(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 226
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->passwordEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/Util;->shakeAnimation(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->confirmPsdEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/Util;->shakeAnimation(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 235
a=0;//     :cond_5
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/Util;->isUsernamelong(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 236
a=0;//     const-string v1, "\u7528\u6237\u540d\u957f\u5ea6\u5fc5\u987b\u662f\u5927\u4e8e6\u4f4d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v10}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 239
a=0;//     :cond_6
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     .line 240
a=0;//     const-string v1, "\u8f93\u5165\u7684\u5bc6\u7801\u4e0d\u4e00\u81f4"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v10}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     :cond_7
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-lt v1, v5, :cond_8
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     if-le v1, v5, :cond_9
a=0;// 
a=0;//     .line 244
a=0;//     :cond_8
a=0;//     const-string v1, "\u5bc6\u7801\u957f\u5ea6\u5fc5\u987b\u662f6~16\u4f4d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v10}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_9
a=0;//     #v1=(Integer);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/threads/RegistThread;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/threads/RegistThread;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/RegistActivity;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/com/cn/threads/RegistThread;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 249
a=0;//     .local v0, "regThread":Lcom/twocloo/com/cn/threads/RegistThread;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/RegistThread;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/threads/RegistThread;->start()V
a=0;// 
a=0;//     .line 250
a=0;//     const-string v1, "\u6ce8\u518c\u4e2d\uff0c\u8bf7\u7a0d\u540e..."
a=0;// 
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->progress:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 251
a=0;//     .end local v0    # "regThread":Lcom/twocloo/com/cn/threads/RegistThread;
a=0;//     .end local v2    # "name":Ljava/lang/String;
a=0;//     .end local v3    # "password":Ljava/lang/String;
a=0;//     .end local v4    # "mobile":Ljava/lang/String;
a=0;//     .end local v6    # "nickname":Ljava/lang/String;
a=0;//     .end local v9    # "psdConfirm":Ljava/lang/String;
a=0;//     :cond_a
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v9=(Uninit);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$id;->privacy_tv:I
a=0;// 
a=0;//     if-ne v7, v1, :cond_0
a=0;// 
a=0;//     .line 252
a=0;//     new-instance v8, Landroid/content/Intent;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/PrivacyActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v8, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 253
a=0;//     .local v8, "it":Landroid/content/Intent;
a=0;//     #v8=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v8}, Lcom/twocloo/com/cn/activitys/RegistActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     invoke-super {p0, p1}, Lcom/twocloo/base/openapi/QZoneAble;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 124
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RegistActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 125
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->regist:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 126
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 127
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->initViews()V
a=0;// 
a=0;//     .line 128
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/RegistActivity;->setTopBar()V
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->nameEdit:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/Util;->showSoftKeyBoard(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 131
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onDestroy()V
a=0;// 
a=0;//     .line 198
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RegistActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 199
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->remove(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 200
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onPause()V
a=0;// 
a=0;//     .line 191
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/RegistActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageEnd(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 193
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 194
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     invoke-super {p0}, Lcom/twocloo/base/openapi/QZoneAble;->onResume()V
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onPageStart(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 170
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->check:Landroid/widget/CheckBox;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->registerConfirmBtn:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->login_button_selector:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->registerConfirmBtn:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 176
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sput-object p0, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->mainlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->topbarlayot:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/RegistActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 186
a=0;//     return-void
a=0;// .end method
}}
