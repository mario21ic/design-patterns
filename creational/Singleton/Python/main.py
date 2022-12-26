class Singleton(object):
  def __new__(cls):
    if not hasattr(cls, 'instance'):
      cls.instance = super(Singleton, cls).__new__(cls)
    return cls.instance

def main():
    s1 = Singleton()
    print(s1)
    s2 = Singleton()
    print(s2)

if __name__=="__main__":
    main()
