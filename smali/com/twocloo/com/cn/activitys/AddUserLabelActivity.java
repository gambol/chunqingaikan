package com.twocloo.com.cn.activitys; class AddUserLabelActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "AddUserLabelActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private addLabelAdapter:Lcom/twocloo/com/cn/adapters/AddLabelAdapter;
a=0;// 
a=0;// .field private add_labelButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private button_list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private complete:Landroid/widget/TextView;
a=0;// 
a=0;// .field private editText:Landroid/widget/EditText;
a=0;// 
a=0;// .field private gridView_label:Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;// .field private gridView_my_label:Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private label_count:I
a=0;// 
a=0;// .field private list:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private myLabelAdapter:Lcom/twocloo/com/cn/adapters/MyLabelAdapter;
a=0;// 
a=0;// .field private sBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->label_count:I
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->sBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;Lcom/twocloo/com/cn/adapters/AddLabelAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->addLabelAdapter:Lcom/twocloo/com/cn/adapters/AddLabelAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Lcom/twocloo/com/cn/view/CustomGridView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->gridView_label:Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/CustomGridView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Lcom/twocloo/com/cn/adapters/AddLabelAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->addLabelAdapter:Lcom/twocloo/com/cn/adapters/AddLabelAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/AddLabelAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)Lcom/twocloo/com/cn/adapters/MyLabelAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->myLabelAdapter:Lcom/twocloo/com/cn/adapters/MyLabelAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/MyLabelAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->complete:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->complete:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 160
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaoqian_customGridView:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->gridView_label:Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;//     .line 161
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->my_biaoqian_customGridView:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->gridView_my_label:Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;//     .line 162
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->add_zidingyi_label:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->add_labelButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->add_labelButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 164
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 166
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->main_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 167
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->complete:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 169
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setDayOrNightMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 219
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 2
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "resultCode"    # I
a=0;//     .param p3, "data"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     const/16 v1, 0x3e9
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v1, p2, :cond_0
a=0;// 
a=0;//     .line 202
a=0;//     const-string v1, "edittext"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "text":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->myLabelAdapter:Lcom/twocloo/com/cn/adapters/MyLabelAdapter;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/adapters/MyLabelAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 208
a=0;//     .end local v0    # "text":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->add_labelButton:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     if-ne p1, v2, :cond_2
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 175
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 176
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "title"
a=0;// 
a=0;//     const-string v3, "\u7f16\u8f91\u6807\u7b7e"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 177
a=0;//     const-string v2, "type"
a=0;// 
a=0;//     const-string v3, "biaoqian"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 178
a=0;//     const/16 v2, 0x3e9
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 196
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 180
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(PosByte);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "\u6700\u591a\u53ef\u6dfb\u52a0\u56db\u4e2a\u6807\u7b7e\u5406"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 183
a=0;//     :cond_2
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->complete:Landroid/widget/TextView;
a=0;// 
a=0;//     if-ne p1, v2, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 185
a=0;//     .restart local v1    # "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_3
a=0;// 
a=0;//     .line 192
a=0;//     const-string v2, "mark"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->sBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 193
a=0;//     const/16 v2, 0x3ed
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {p0, v2, v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->setResult(ILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     if-ge v0, v2, :cond_4
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->sBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ","
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 185
a=0;//     :goto_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 189
a=0;//     :cond_4
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->sBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 74
a=0;//     sget v3, Lcom/twocloo/com/cn/R$layout;->add_label_activity:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 75
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->initView()V
a=0;// 
a=0;//     .line 78
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "mark"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 79
a=0;//     .local v1, "mark":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     const-string v3, ","
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 81
a=0;//     .local v2, "marks":[Ljava/lang/String;
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_1
a=0;// 
a=0;//     .line 85
a=0;//     .end local v0    # "i":I
a=0;//     .end local v2    # "marks":[Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/Thread;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$2;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 114
a=0;//     #v3=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 116
a=0;//     new-instance v3, Lcom/twocloo/com/cn/adapters/MyLabelAdapter;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/adapters/MyLabelAdapter;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4, v5}, Lcom/twocloo/com/cn/adapters/MyLabelAdapter;-><init>(Ljava/util/ArrayList;Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/adapters/MyLabelAdapter;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->myLabelAdapter:Lcom/twocloo/com/cn/adapters/MyLabelAdapter;
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->gridView_my_label:Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->myLabelAdapter:Lcom/twocloo/com/cn/adapters/MyLabelAdapter;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/view/CustomGridView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->gridView_label:Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;//     new-instance v4, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$3;);
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/view/CustomGridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->gridView_my_label:Lcom/twocloo/com/cn/view/CustomGridView;
a=0;// 
a=0;//     new-instance v4, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$4;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$4;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$4;);
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/view/CustomGridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     new-instance v4, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$5;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$5;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$5;-><init>(Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/AddUserLabelActivity$5;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 156
a=0;//     return-void
a=0;// 
a=0;//     .line 82
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v2    # "marks":[Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Reference,[Ljava/lang/String;);v3=(Integer);v5=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->button_list:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     aget-object v4, v2, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 81
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 234
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 236
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 242
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 244
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->setTopLayout()V
a=0;// 
a=0;//     .line 226
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->setDayOrNightMode()V
a=0;// 
a=0;//     .line 228
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 213
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 214
a=0;//     return-void
a=0;// .end method
}}
