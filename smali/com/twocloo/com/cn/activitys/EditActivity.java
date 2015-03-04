package com.twocloo.com.cn.activitys; class EditActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "EditActivity.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private completeTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private editText:Landroid/widget/EditText;
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private title:Landroid/widget/TextView;
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/EditActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/EditActivity;)Landroid/widget/EditText;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/EditText;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->main_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 106
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 107
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 108
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->complete:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->completeTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 109
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->edittext:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/EditText;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     .line 110
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->title:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setDayOrNightMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 8
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 44
a=0;//     #v6=(One);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {p0, v6}, Lcom/twocloo/com/cn/activitys/EditActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 46
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->edit_activity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/EditActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditActivity;->initView()V
a=0;// 
a=0;//     .line 49
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/EditActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "title"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->title:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "type"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "type":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "info"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "info":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 58
a=0;//     const-string v2, "biaoqian"
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/EditText;);
a=0;//     new-array v3, v6, [Landroid/text/InputFilter;
a=0;// 
a=0;//     new-instance v4, Lcom/twocloo/com/cn/utils/CustomLengthFilter;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/utils/CustomLengthFilter;);
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v4, v5}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/utils/CustomLengthFilter;);
a=0;//     aput-object v4, v3, v7
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Landroid/widget/EditText;->setLines(I)V
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->input_background:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 76
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->backBtn:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/EditActivity$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/EditActivity$1;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/com/cn/activitys/EditActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/EditActivity;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/EditActivity$1;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->completeTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/EditActivity$2;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/EditActivity$2;);
a=0;//     invoke-direct {v3, p0}, Lcom/twocloo/com/cn/activitys/EditActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/EditActivity;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/EditActivity$2;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// 
a=0;//     .line 62
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v5=(Uninit);
a=0;//     const-string v2, "nicheng"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/EditText;);
a=0;//     invoke-virtual {v2, v6}, Landroid/widget/EditText;->setLines(I)V
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     new-array v3, v6, [Landroid/text/InputFilter;
a=0;// 
a=0;//     new-instance v4, Lcom/twocloo/com/cn/utils/CustomLengthFilter;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/utils/CustomLengthFilter;);
a=0;//     const/16 v5, 0xc
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v4, v5}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/utils/CustomLengthFilter;);
a=0;//     aput-object v4, v3, v7
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->input_background:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Uninit);
a=0;//     const-string v2, "qianming"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/EditText;);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setLines(I)V
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     const/16 v3, 0x30
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setGravity(I)V
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     const-string v3, "\u8bf7\u8f93\u5165\u7b7e\u540d\uff08\u6700\u591a\u53ef\u8f93\u516550\u4e2a\u5b57\u7b26\uff09"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     new-array v3, v6, [Landroid/text/InputFilter;
a=0;// 
a=0;//     new-instance v4, Lcom/twocloo/com/cn/utils/CustomLengthFilter;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/utils/CustomLengthFilter;);
a=0;//     const/16 v5, 0x64
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v4, v5}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/utils/CustomLengthFilter;);
a=0;//     aput-object v4, v3, v7
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->input_edit_white:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/EditText;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->editText:Landroid/widget/EditText;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 144
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/EditActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditActivity;->finish()V
a=0;// 
a=0;//     .line 118
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 135
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditActivity;->setTopLayout()V
a=0;// 
a=0;//     .line 136
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditActivity;->setDayOrNightMode()V
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 123
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/EditActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
}}
