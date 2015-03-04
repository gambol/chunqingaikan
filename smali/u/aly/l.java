package u.aly; class l { void a() { int a;
a=0;// .class public Lu/aly/l;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Caretaker.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Z
a=0;// 
a=0;// .field private c:Landroid/content/SharedPreferences;
a=0;// 
a=0;// .field private d:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lu/aly/aa;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lu/aly/l;);
a=0;//     const-string v0, "umeng_event_snapshot"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lu/aly/l;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 14
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lu/aly/l;->b:Z
a=0;// 
a=0;//     .line 17
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     .line 20
a=0;//     const-string v0, "umeng_event_snapshot"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lu/aly/u;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lu/aly/l;->c:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-gt v1, v2, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     invoke-static {v0}, Lu/aly/s;->a(Ljava/io/Serializable;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 85
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Lu/aly/l;->c:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// 
a=0;//     .line 79
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private d(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 94
a=0;//     #v1=(One);
a=0;//     iget-object v0, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 108
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     iget-object v0, p0, Lu/aly/l;->c:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 99
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 101
a=0;//     invoke-static {v0}, Lu/aly/s;->a(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 102
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v2, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 32
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Lu/aly/aa;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-boolean v0, p0, Lu/aly/l;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     invoke-direct {p0, p1}, Lu/aly/l;->d(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 48
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Lu/aly/l;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 49
a=0;//     invoke-direct {p0, p1}, Lu/aly/l;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 51
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 43
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v1, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     iput-boolean p1, p0, Lu/aly/l;->b:Z
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)Lu/aly/aa;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-boolean v0, p0, Lu/aly/l;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     invoke-direct {p0, p1}, Lu/aly/l;->d(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lu/aly/l;->d:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lu/aly/aa;
a=0;// 
a=0;//     .line 66
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-boolean v1, p0, Lu/aly/l;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     invoke-direct {p0, p1}, Lu/aly/l;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 70
a=0;//     :cond_1
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
