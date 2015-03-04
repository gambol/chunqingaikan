package cn.dm.android.ui; class a { void a() { int a;
a=0;// .class public Lcn/dm/android/ui/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcn/dm/android/f/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Z
a=0;// 
a=0;// .field private final c:Ljava/lang/String;
a=0;// 
a=0;// .field private final d:Ljava/lang/String;
a=0;// 
a=0;// .field private final e:Ljava/lang/String;
a=0;// 
a=0;// .field private final f:Ljava/lang/String;
a=0;// 
a=0;// .field private final g:Ljava/lang/String;
a=0;// 
a=0;// .field private h:Landroid/content/Context;
a=0;// 
a=0;// .field private i:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private j:Lcn/dm/android/g/b;
a=0;// 
a=0;// .field private k:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private l:Lcn/dm/android/g/a;
a=0;// 
a=0;// .field private m:Ljava/lang/String;
a=0;// 
a=0;// .field private n:Ljava/lang/String;
a=0;// 
a=0;// .field private o:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/ui/a;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/android/ui/a;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 33
a=0;//     #p0=(Reference,Lcn/dm/android/ui/a;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcn/dm/android/ui/a;->b:Z
a=0;// 
a=0;//     .line 35
a=0;//     const-string v0, "header.html"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     const-string v0, "help.html"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 39
a=0;//     const-string v0, "detail.html"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 41
a=0;//     const-string v0, "taskList.html"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     const-string v0, "signList.html"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->g:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->k:Ljava/util/List;
a=0;// 
a=0;//     .line 55
a=0;//     iput-object v1, p0, Lcn/dm/android/ui/a;->m:Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     iput-object v1, p0, Lcn/dm/android/ui/a;->n:Ljava/lang/String;
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v0, Lcn/dm/android/ui/a$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/ui/a$1;);
a=0;//     invoke-direct {v0, p0}, Lcn/dm/android/ui/a$1;-><init>(Lcn/dm/android/ui/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/ui/a$1;);
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->o:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .line 60
a=0;//     iput-object p1, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {p0}, Lcn/dm/android/ui/a;->b()V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/support/v4/view/ViewPager;)Lcn/dm/android/g/a;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     new-instance v0, Lcn/dm/android/g/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/g/a;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Lcn/dm/android/g/a;-><init>(Landroid/content/Context;Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     .line 213
a=0;//     #v0=(Reference,Lcn/dm/android/g/a;);
a=0;//     const-string v1, "#FAFAFA"
a=0;// 
a=0;//     invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/g/a;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 215
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const-string v3, "\u4efb\u52a1\u5217\u8868"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const-string v3, "\u989d\u5916\u5956\u52b1"
a=0;// 
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     const/high16 v2, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "#555555"
a=0;// 
a=0;//     invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const-string v4, "#FF5131"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Lcn/dm/android/g/a;->a([Ljava/lang/String;FII)V
a=0;// 
a=0;//     .line 217
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/ui/a;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->k:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private f()Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 154
a=0;//     #v2=(Byte);
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 155
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 157
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 158
a=0;//     const-string v1, "\u7f51\u7edc\u4e0d\u7ed9\u529b"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 159
a=0;//     const/high16 v1, 0x41900000    # 18.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 160
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "template_vn"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Lcn/dm/android/b/b;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 163
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private g()Landroid/support/v4/view/ViewPager;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "taskList.html"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 170
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "signList.html"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 172
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcn/dm/android/ui/a;->n:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "taskList.html"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcn/dm/a/d/b;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 174
a=0;//     new-instance v2, Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/g/b;);
a=0;//     iget-object v3, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v2, v3}, Lcn/dm/android/g/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 175
a=0;//     #v2=(Reference,Lcn/dm/android/g/b;);
a=0;//     invoke-virtual {v2, v0}, Lcn/dm/android/g/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 176
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->k:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 181
a=0;//     :goto_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->n:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "signList.html"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/a/d/b;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 183
a=0;//     new-instance v0, Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/g/b;);
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v2}, Lcn/dm/android/g/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 184
a=0;//     #v0=(Reference,Lcn/dm/android/g/b;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/g/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->k:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 190
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 192
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 193
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->o:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 195
a=0;//     return-object v0
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v2=(Boolean);
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->k:Ljava/util/List;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/dm/android/ui/a;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->k:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-direct {p0}, Lcn/dm/android/ui/a;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->l:Lcn/dm/android/g/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/g/a;);
a=0;//     invoke-virtual {v0, p1}, Lcn/dm/android/g/a;->a(I)V
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "detail.html"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->n:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "detail.html"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/dm/a/d/b;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 112
a=0;//     new-instance v1, Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/g/b;);
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcn/dm/android/g/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 113
a=0;//     #v1=(Reference,Lcn/dm/android/g/b;);
a=0;//     invoke-virtual {v1, v0, p1}, Lcn/dm/android/g/b;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 118
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 116
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/dm/android/ui/a;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected b()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->n:Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "file://"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/dm/android/ui/a;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "/android_asset/"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/ui/a;->m:Ljava/lang/String;
a=0;// 
a=0;//     .line 78
a=0;//     sget-object v0, Lcn/dm/android/ui/a;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "template base url:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     return-void
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->n:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public c()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "help.html"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->n:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "help.html"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/dm/a/d/b;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v1, Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/g/b;);
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcn/dm/android/g/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 90
a=0;//     #v1=(Reference,Lcn/dm/android/g/b;);
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/g/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/dm/android/ui/a;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public d()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "header.html"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 126
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->n:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "header.html"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/dm/a/d/b;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     sget-object v1, Lcn/dm/android/ui/a;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v2, "template exists"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 128
a=0;//     new-instance v1, Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/g/b;);
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->h:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcn/dm/android/g/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/g/b;);
a=0;//     iput-object v1, p0, Lcn/dm/android/ui/a;->j:Lcn/dm/android/g/b;
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->j:Lcn/dm/android/g/b;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/g/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->j:Lcn/dm/android/g/b;
a=0;// 
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/g/b;->a(I)V
a=0;// 
a=0;//     .line 132
a=0;//     invoke-direct {p0}, Lcn/dm/android/ui/a;->g()Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 134
a=0;//     invoke-direct {p0, v0}, Lcn/dm/android/ui/a;->a(Landroid/support/v4/view/ViewPager;)Lcn/dm/android/g/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/g/a;);
a=0;//     iput-object v1, p0, Lcn/dm/android/ui/a;->l:Lcn/dm/android/g/a;
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->j:Lcn/dm/android/g/b;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/ui/a;->l:Lcn/dm/android/g/a;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v1, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 147
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     sget-object v1, Lcn/dm/android/ui/a;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "template not exists"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->i:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/dm/android/ui/a;->f()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public e()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->k:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->k:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 202
a=0;//     check-cast v0, Lcn/dm/android/g/b;
a=0;// 
a=0;//     const-string v2, "onResume()"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcn/dm/android/g/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/ui/a;->j:Lcn/dm/android/g/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/g/b;);
a=0;//     const-string v1, "onResume()"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/g/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 206
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
